//Name: Darnell Love
package org.howard.edu.hw4;
import IntegerSet;


/**
 * 
 * @return set
 */

public class Driver {

	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		
		//Tests adding elements to set
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Smallest value in Set1 is:" + set1.smallest());

	}

}
