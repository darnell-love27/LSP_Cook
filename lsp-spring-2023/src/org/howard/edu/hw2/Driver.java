package org.howard.edu.hw2;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		FileReader file = new FileReader();
		try {
				System.out.println(file.readToString("main/java/resources/words.txt"));
		} catch (FileNotFoundException e) {
				System.out.println("Unable to open resource");
				
		}

	}


}
