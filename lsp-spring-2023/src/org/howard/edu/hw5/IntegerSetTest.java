package org.howard.edu.hw5;

import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IntegerSetTest {
	private List<Integer> new_set = new ArrayList<Integer>();
	
	@Test
	@DisplayName("Test case for clear")
	public void testclear() {
		new_set.add(16);
		new_set.clear();
		assertTrue(new_set.isEmpty());
	}
	@Test
	@DisplayName("Test case for length")
	public void testlength() {
		new_set.add(2);
		new_set.add(4);
		new_set.add(6);
		new_set.add(8);
		int set_length = new_set.size();
		assertEquals(4,set_length);
	}
	
	@Test
	@DisplayName("Test case for is equal")
	public void testequals() {
		List<Integer> set2 = new ArrayList<Integer>();
		
		new_set.add(1);
		new_set.add(2);
		new_set.add(3);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		assertFalse(new_set.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for value method")
	public void contains() {
		new_set.add(5);
		new_set.add(10);
		new_set.add(15);
		
		assertTrue(new_set.contains(5));
	}
	
	@Test
	@DisplayName("Test case for largest item in set")
	public void testlargest() {
		int maxVal = Integer.MIN_VALUE;
		
		new_set.add(3);
		new_set.add(6);
		new_set.add(9);
		new_set.add(12);
		new_set.add(15);
		
		for (Integer integer : new_set) {
			if (integer > maxVal) {
				maxVal = integer;
			}
		}
		
		assertEquals(15, maxVal);
	}
	
	@Test
	@DisplayName("Test case for smallest item in set")
	public void testsmallest() {
		int minVal = Integer.MAX_VALUE;
		
		new_set.add(3);
		new_set.add(6);
		new_set.add(9);
		new_set.add(12);
		new_set.add(15);
		
		
		for (Integer integer : new_set) {
			if (integer < minVal) {
				minVal = integer;
			}
		}
		
		assertEquals(3, minVal);
	}
	
	@Test
	@DisplayName("Test case for add")
	public void testadd() {
		
		new_set.add(1);
		new_set.add(2);
		new_set.add(3);
		new_set.add(4);
		
		assertTrue(new_set.contains(1));
		assertTrue(new_set.contains(2));
		assertTrue(new_set.contains(3));
		assertTrue(new_set.contains(4));
		
		assertEquals(4, new_set.size());
	}

	
	@Test
	@DisplayName("Test case for remove")
	public void testremove() {
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
		
		assertEquals(4, new_set.size());
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testunion() {
		List<Integer> set2 = new ArrayList<Integer>();
		List<Integer> union_set = new ArrayList<Integer>();
		
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testintersect() {
		
	}
	
	@Test
	@DisplayName("Test case for difference")
	public void testdiff() {
		
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testisEmpty() {
		assertTrue(new_set.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testtoString() {
		
	}
}
