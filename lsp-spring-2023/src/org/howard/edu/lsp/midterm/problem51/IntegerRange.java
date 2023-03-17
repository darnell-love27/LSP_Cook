package org.howard.edu.lsp.midterm.problem51;

import java.util.*;
public class IntegerRange implements Range {
	
	private int lower;
	private int upper;
	
	//Hint: implement getters for lower and upper
	public int getLower() {
		return lower;
	}
	
	public int getUpper() {
		return upper;
	}

	public IntegerRange(int lower, int upper) { //Constructor
		this.lower = lower;
		this.upper = upper;
	}
	public boolean contains(int value) {
		//return true/false if contains value
		if (value >= lower && value <= upper) {
			return true;
		}
		return false;
	}
	public boolean overlaps(Range other) throws EmptyRangeException {
		//implement 
	}
	public int size() {
		int total = (upper - lower) + 1;
		return total;
	}

}
