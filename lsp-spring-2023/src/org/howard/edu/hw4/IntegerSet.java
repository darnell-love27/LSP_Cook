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
		if(new_set.size() == set.length()) {
			return new_set.containsAll(set.new_set);
		}else {
			return false;
		}
	public int large() throws IntegerSetException {
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
	public int small() throws IntegerSetException{
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
	
	public void add(int num) {
		if(new_set.contains(num) == false) {
			new_set.add(num);
		}
	}
	
	public void remove(int num) {
		if (new_set.contains(num) == true) {
			new_set.remove(num);
		}
	}
	
	public void union(IntegerSet number) {
		for(int x = 0; x < number.new_set.size(); x++) {
			if(new_set.contains(number.new_set.get(x)) == false) {
				new_set.add(number.new_set.get(x));
			}
		}
	
	}
	public void intersect(IntegerSet number) {
		new_set.retainAll(number.new_set);
	}
	

}
