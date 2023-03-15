// Name: Darnell Love
package org.howard.edu.hw5;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used as an integer set, which is made up of a collection of integers which provide methods and attributes for changing the set. 
 * @author Darnell
 *
 */

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
	
	//Clears internal representation of set
	public void of_set(List<Integer> new_set) {
		new_set.clear();
	}
	
	//Returns length of set
	public int length() {
		return new_set.size();
	}
	//Return true if both sets are equal, otherwise return false
	public boolean equals(IntegerSet set) {
		if(new_set.size() != set.length()) {
			return false;
		}else {
			return new_set.containsAll(set.new_set);
		}
	}
	
	//Return true/false if set contains given value or not
	public boolean contains(int value) {
		return new_set.contains(value);
	}
	
	//Returns largest item in set by setting maxVal to the lowest	
	public int largest() throws IntegerSetException {
		int maxVal = Integer.MIN_VALUE;
		if (new_set.isEmpty()) {
			throw new IntegerSetException("Set is Empty");
		}
		else {
			for (Integer integer : new_set) {
				if (integer > maxVal) {
					maxVal = integer;
				}
			}
		}
	return maxVal;
	}
	//Returns the smallest value in the set
	public int smallest() throws IntegerSetException{
		int minVal = Integer.MAX_VALUE;
		if(new_set.isEmpty()) {
			throw new IntegerSetException("Set is Empty");
		}
		else {
			for (Integer integer : new_set) {
				if(integer < minVal) {
					minVal = integer;
				}
			}
		}
		return minVal;
	}
	
	//If the set does not contain num -> add to set
	public void add(int num) {
		if(new_set.contains(num) == false) {
			new_set.add(num);
		}
	}
	//If num is in the set -> remove it
	public void remove(int num) {
		if (new_set.contains(num) == true) {
			new_set.remove(num);
		}
	}
	//If value is in set inSetb -> adds to inSetb
	public void union(IntegerSet inSetb) {
		for(int x = 0; x < inSetb.new_set.size(); x++) {
			if(new_set.contains(inSetb.new_set.get(x)) == false) {
				new_set.add(inSetb.new_set.get(x));
			}
		}
	
	}
	//If value is in both new_set and inSetb -> keeps them
	public void intersect(IntegerSet inSetb) {
		new_set.retainAll(inSetb.new_set);
	}
	//If value 'y' is in both sets -> remove it
	public void difference(IntegerSet inSetb) {
		for(int y = 0; y < inSetb.length(); y++) {
			if(new_set.contains(inSetb.new_set.get(y)) == true) {
				new_set.remove(inSetb.new_set.get(y));
			}
		}
	}
	//Checks to see if the set is empty
	public boolean isEmpty() {
		if(new_set.isEmpty() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	//Returns string representation of set
	public String toString() {
		String newString = "";
		for(int s = 0; s < new_set.size(); s++) {
			newString += new_set.get(s).toString() + ' ';
		}
		return newString;
	}

}
