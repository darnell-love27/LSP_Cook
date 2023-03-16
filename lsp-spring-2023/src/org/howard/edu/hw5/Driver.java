//Name: Darnell Love
package org.howard.edu.hw5;

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
		
		System.out.println("Is new_set an empty set? " + new_set.isEmpty());
		
		System.out.println("Does new_set contain the number -1: " + new_set.contains(-1));
		
		System.out.println("Value of new_set is:" + new_set.toString());
		
		//Smallest & Largest values in new_set
		System.out.println("The smallest value in new_set is: " + new_set.smallest());
		System.out.println("The largest value in new_set is: " + new_set.largest());

		set2.add(2);
		set2.add(4);
		set2.add(-4);
		System.out.println("Value of new_set is: " + set2.toString());
		
		//Union of new_set with set2
		IntegerSet union_set = new IntegerSet();
		union_set = new_set;
		union_set.union(set2);
		System.out.println("The union of new_set and set2 is: "+union_set.toString());
		
		//Intersect between new_set and set2
		IntegerSet intersect_set = new IntegerSet();
		intersect_set = new_set;
		intersect_set.intersect(set2);
		System.out.println("The intersection of new_set and set2 is:"+ intersect_set.toString());
		
		//Difference between new_set and set2
		IntegerSet diff_set = new IntegerSet();
		diff_set = new_set;
		diff_set.diff(set2);
		System.out.println("The difference of new_set and set2 is: "+ diff_set.toString());
		
		//After removing elements from new_set
		new_set.remove(-1);
		new_set.remove(-2);
		new_set.remove(-3);
		System.out.println("Result after removing -1, -2, -3: "+ new_set.toString());
		
		//Testing for equality between sets
		System.out.println("Is new_set equal to set2? " + new_set.equals(set2));
		
		
		
	}

}
