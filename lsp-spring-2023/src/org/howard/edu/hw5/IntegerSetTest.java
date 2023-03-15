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
		List<Integer> set1 = new ArrayList<Integer>();
		List<Integer> set2 = new ArrayList<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		assertFalse(set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for is largest")
	public void testlargest() {
		
	}
	
	@Test
	@DisplayName("Test case for is smallest")
	public void testsmallest() {
		
	}
	
	@Test
	@DisplayName("Test case for add")
	public void testadd() {
		
	}

	
	@Test
	@DisplayName("Test case for remove")
	public void testremove() {
		
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testunion() {
		
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
		
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testtoString() {
		
	}
}
