//Name: Darnell Love
package org.howard.edu.hw4;

import static org.junit.Assert.assertEquals;

import org.howard.edu.hw4.IntegerSet.IntegerSetException;
import org.howard.edu.hw5.IntegerSet;

/**
 * 
 * @return set
 */

public class Driver {

	public static void main(String[] args) throws org.howard.edu.hw5.IntegerSet.IntegerSetException {
		IntegerSet new_set = new IntegerSet();
		
		//Tests adding elements to set
		IntegerSet set2 = new IntegerSet();
		new_set.add(-1);
		new_set.add(-2);
		new_set.add(-3);
		new_set.add(-4);
		
		set2.add(2);
		set2.add(4);
		set2.add(-4);
		
		System.out.println("Value of new_set is:" + new_set.toString());
		System.out.println("Value of set2 is:" + set2.toString());
		
		System.out.println("Smallest value in new_set is:" + new_set.smallest());
		System.out.println("Largest value in new_set is:" + new_set.largest());
		System.out.println("Smallest value in set2 is:" + set2.smallest());
		System.out.println("Largest value in set2 is:" + set2.largest());
		
		IntegerSet union_set = new IntegerSet();
		union_set = new_set;
		union_set.union(set2);
		System.out.println("Union of new_set and set2 is:" + union_set.toString());
		
		IntegerSet intersect_set = new IntegerSet();
		intersect_set = new_set;
		intersect_set.intersect(set2);
		System.out.println(intersect_set.toString());
		
		System.out.println("New_set contains the number -1: " + new_set.contains(-2));
		
		
		
		
	}

}
