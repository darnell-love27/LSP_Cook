package org.howard.edu.lsp.midterm.problem51;

public interface Range {
	IntegerRange new_range = new IntegerRange();
	public boolean contains(int value) {
	if((value >= new_range.getLower()) && (value <= new_range.getUpper())) {
		return true;
		
	}
	return false;
	}
	//returns true if value is >= lower bound and <= upper bound
	//and false otherwise
	
	public boolean overlaps(Range other) throws EmptyRangeException{
	//returns true if the receiver contains at least
	//one value in common with other, and false otherwise
	//EmptyRangeException is thrown when a null Range object is passed to the method
	}
	public int size() {
	//return number of integers in the range
		int total = (new_range.getUpper()- new_range.getLower()) + 1;
		return total;
	}
}
