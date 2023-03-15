package org.howard.edu.hw5;

import org.junit.*;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {
	private List<Integer> new_set = new ArrayList<Integer>();
	
	@Test
	@DisplayName("Test case for clear")
	public void testclear() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	@DisplayName("Test case for length")
	public int testlength() {
		new_set.add(2);
		new_set.add(4);
		new_set.add(6);
		new_set.add(8);
		int set_length = new_set.size();
		assertEquals(4,set_length);
	}
	
	@Test
	@DisplayName("Test case for is equal")
	public boolean testequals() {
		
	}
	
	@Test
	@DisplayName("Test case for is largest")
	public int testlargest() {
		
	}
	
	@Test
	@DisplayName("Test case for is smallest")
	public int testsmallest() {
		
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
	public boolean testisEmpty() {
		
	}
	
	@Test
	@DisplayName("Test case for toString")
	public String testtoString() {
		
	}
}
