// Name: Darnell Love
package org.howard.edu.hw4;
import java.util.*;
public class IntegerSet {
	
	private List<Integer> new_set;
	
	//Default Constructor as ArrayList
	public IntegerSet(){
		new_set = new ArrayList<Integer>();
	}

	public class IntegerSetException extends Exception{
		public IntegerSetException(String error) {
			super(error);
		}

	}
	
	//List used for set of Integers
	public List<Integer> find_set() {
		return new_set;
	}
	
	//Clears internal representation of set
	public void of_set(List<Integer> new_set) {
		new_set.clear();
	}
	
	//Returns length of set
	public int length() {
		return new_set.size();
	}
	//
	public boolean equals(IntegerSet set) {
		
	}

}
