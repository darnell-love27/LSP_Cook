//Darnell Love

package org.howard.edu.hw2;


import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.HashMap;

public class Word_Counter {

	public static void main(String[] args) {
		
		FileReader file = new FileReader();
		//Count variable for number of word occurrences
		int count = 0;
		//Created a HashMap with String Keys and Integer Values
		HashMap<String, Integer> NewMap = new HashMap<>();
		
		try {
				//String that reads the file
				String string = file.readToString("main/java/resources/words.txt");
				//Initialize String array for each word in the string file that are separated by a space
				String[] splitter = string.toLowerCase().split(" ");
				
				//For each word in splitter, if they have a length greater than 3 -> Add to NewMap and value 
				//Increase value dependent by count variable
				for (int x = 0; x < splitter.length; x++) {
					if (splitter[x].length() > 3) {
						//Check if word at splitter[x] has value > 0
						if (NewMap.get(splitter[x]) != null) {
							count++;
							NewMap.put(splitter[x], NewMap.get(splitter[x]) + count);
						}
						//If value = 0 -> set to 1
						else {
							NewMap.put(splitter[x], 1);
						}
					}
				}
				//Each word in NewMap is printed with the number of occurrences
				for (String word : NewMap.keySet()) {
					System.out.println(word + " " + NewMap.get(word));
				}
				
		} catch (FileNotFoundException e) {
				System.out.println("Unable to open resource");
				
		}

	}


}
