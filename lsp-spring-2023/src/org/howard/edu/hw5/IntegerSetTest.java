package org.howard.edu.hw5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.howard.edu.hw5.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	
	private IntegerSet new_set;
	
	@BeforeEach
	public void construct() {
		new_set = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testclear() {
		//Test for one element
		new_set.add(16);
		new_set.clear();
		assertTrue(new_set.isEmpty());
		
		//Test for two element
		new_set.add(10);
		new_set.add(20);
		new_set.clear();
		assertTrue(new_set.isEmpty());
		
		//Test for non-negative and negative integers
		new_set.add(-1);
		new_set.add(-2);
		new_set.add(3);
		new_set.clear();
		new_set.add(100);
		new_set.add(-200);
		new_set.add(56);
		new_set.clear();
		assertTrue(new_set.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for length")
	public void testlength() {
		//Length of set with one element
		new_set.add(2);
		int set_length = new_set.length();
		assertEquals(1,set_length);
		
		//Length of set with three elements
		new_set.add(4);
		new_set.add(6);
		new_set.add(8);
		set_length = new_set.length();
		assertEquals(4,set_length);
		
		//Length of set after clear
		new_set.add(-20);
		new_set.add(-30);
		new_set.add(-40);
		new_set.clear();
		set_length = new_set.length();
		assertEquals(0,set_length);
		
		//Length of set of duplicates
		new_set.add(1);
		new_set.add(1);
		set_length = new_set.length();
		assertEquals(1,set_length);
	}
	
	@Test
	@DisplayName("Test case for is equal")
	public void testequals() {
		IntegerSet set2 = new IntegerSet();
		//set2 as empty set
		assertTrue(new_set.equals(set2));
		
		//Add one element to each set
		new_set.add(1);
		set2.add(1);
		assertTrue(new_set.equals(set2));
		
		//Add two more elements to each set
		new_set.add(2);
		new_set.add(3);
		set2.add(4);
		set2.add(5);
		assertFalse(new_set.equals(set2));
		
		//Compare set to itself
		assertTrue(new_set.equals(new_set));
		assertTrue(set2.equals(set2));
		
		//Compare to different type
		String test_str = "[1 2 3 4 5]";
		assertFalse(new_set.equals(test_str));
	}
	
	@Test
	@DisplayName("Test case for value method")
	public void contains() {
		//Test for one element in new_set
		new_set.add(5);
		assertTrue(new_set.contains(5));
		
		//Test to see if new_set with more than one element contains a given element 
		new_set.add(10);
		new_set.add(15);
		assertTrue(new_set.contains(15));
		
		//Element that is not in new_set
		assertFalse(new_set.contains(0));
		
		//Test case after clear
		new_set.clear();
		assertFalse(new_set.contains(10));
		
	}
	
	@Test
	@DisplayName("Test case for largest item in set")
	public void testlargest() throws IntegerSetException {
		//Testing three positive integers for largest value -> Expected to be 9
		new_set.add(3);
		new_set.add(6);
		new_set.add(9);
		assertEquals(9, new_set.largest());
		
		//Testing for set with all the same elements
		new_set.clear();
		new_set.add(1);
		new_set.add(1);
		new_set.add(1);
		assertEquals(1,new_set.largest());
		
		//Set with positive and negative integers
		new_set.clear();
		new_set.add(20);
		new_set.add(-20);
		assertEquals(20,new_set.largest());
		
		//Empty set
		new_set.clear();
		assertThrows(IntegerSetException.class, () ->new_set.largest());
	}
	@Test
	@DisplayName("Test case for smallest item in set")
	public void testsmallest() throws IntegerSetException{
		//Testing two elements for smallest value in set -> Expected to be 3
		new_set.add(3);
		new_set.add(6);
		assertEquals(3, new_set.smallest());
		
		//Testing for empty set
		new_set.clear();
		assertThrows(IntegerSetException.class, () ->new_set.smallest());
		
		//Test for negative and positive integers
		new_set.add(-2);
		new_set.add(-1);
		new_set.add(0);
		new_set.add(1);
		new_set.add(2);
		assertEquals(-2,new_set.smallest());
	}
	
	@Test
	@DisplayName("Test case for add")
	public void testadd() {
		//Add one element
		new_set.add(1);
		assertTrue(new_set.contains(1));
		
		//Add two elements
		new_set.add(2);
		new_set.add(3);
		assertTrue(new_set.contains(2));
		assertTrue(new_set.contains(3));
		
		//Check for duplicates
		new_set.add(4);
		new_set.add(4);
		assertTrue(new_set.contains(4));
		assertEquals(4, new_set.length());
	}

	
	@Test
	@DisplayName("Test case for remove")
	public void testremove() {
		//Test to remove one element
		new_set.add(10);
		new_set.add(20);
		new_set.add(30);
		new_set.add(40);
		new_set.add(50);
		
		new_set.remove(10);
		
		assertFalse(new_set.contains(10));
		assertTrue(new_set.contains(20));
		assertTrue(new_set.contains(30));
		assertTrue(new_set.contains(40));
		assertTrue(new_set.contains(50));
		assertEquals(4, new_set.length());
		
		//Test to remove all other elements
		new_set.remove(20);
		new_set.remove(30);
		new_set.remove(40);
		new_set.remove(50);
		
		assertEquals(0,new_set.length());
		
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testunion() {
		IntegerSet set2 = new IntegerSet();
		//Performing union on two sets with two elements in each
		new_set.add(100);
		new_set.add(110);
		set2.add(120);
		set2.add(130);
		
		IntegerSet union_set = new IntegerSet();
		union_set = new_set;
		union_set.union(set2);
		
		assertEquals(4,union_set.length());
		assertEquals(true, union_set.contains(100));
		
		//Union with two sets that have the same values
		new_set.clear();
		set2.clear();
		new_set.add(-50);
		new_set.add(25);
		new_set.add(5);
		
		set2.add(-40);
		set2.add(25);
		set2.add(1);
		
		union_set.clear();
		union_set = new_set;
		union_set.union(set2);
		assertEquals(3,union_set.length());
		
		
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testintersect() {
		IntegerSet set2 = new IntegerSet();
		//Test for intersection between two sets
		new_set.add(-1);
		new_set.add(-2);
		new_set.add(-3);
		new_set.add(-4);
		
		set2.add(2);
		set2.add(4);
		set2.add(-2);
		set2.add(-4);
		
		IntegerSet intersect_set = new IntegerSet();
		intersect_set = new_set;
		intersect_set.intersect(set2);
		
		assertTrue(intersect_set.contains(-2));
		assertEquals(2, intersect_set.length());
		
		
		//No Intersection
		new_set.clear();
		set2.clear();
		intersect_set.clear();
		new_set.add(-1);
		new_set.add(-2);
		
		set2.add(-5);
		set2.add(-6);
		new_set.intersect(set2);
		assertTrue(new_set.isEmpty());
		
		
		
	}
	
	@Test
	@DisplayName("Test case for difference")
	public void testdiff() {
		IntegerSet set2 = new IntegerSet();
		new_set.add(1);
		new_set.add(2);
		new_set.add(3);
		
		set2.add(2);
		set2.add(3);
		set2.add(6);
		
		IntegerSet diff_set = new IntegerSet();
		diff_set = new_set;
		diff_set.difference(set2);
		assertEquals(1, diff_set.length());
		
		new_set.clear();
		set2.clear();
		diff_set.clear();
		new_set.add(2);
		new_set.add(4);
		new_set.add(6);
		new_set.add(8);
		
		set2.add(3);
		set2.add(12);
		set2.add(6);
		set2.add(8);
		
		diff_set = new_set;
		diff_set.difference(set2);
		assertTrue(diff_set.contains(2));
		assertTrue(diff_set.contains(4));
		assertEquals(2, diff_set.length());
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testisEmpty() {
		//Test for if set is empty
		assertTrue(new_set.isEmpty());
		
		//Test for if set is not empty
		new_set.add(100);
		assertFalse(new_set.isEmpty());
		
		//Test for if set adds and removes elements
		new_set.add(90);
		new_set.add(180);
		new_set.remove(90);
		new_set.remove(180);
		assertFalse(new_set.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testtoString() {
		//Test for one element in a set
		new_set.add(0);
		assertEquals("[0]", new_set.toString());
		
		//Test for duplicate elements
		new_set.add(0);
		assertEquals("[0]", new_set.toString());
		
		//Test for multiple elements in a set
		new_set.add(-2);
		new_set.add(-3);
		new_set.add(-4);
		assertEquals("[0, -2, -3, -4]", new_set.toString());
}

}
