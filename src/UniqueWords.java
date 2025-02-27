/* Project: Lab2
* Class: UniqueWords.java
* Author: Choi, Sangoh(David)
* Date: February 27, 2025
* This program will count the number of unique words in the ArrayList!
*/

import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {
		int count = 0;

		for (int i = 0; i < list.size(); i++) { //looping through first one
			boolean unique = true; // Reseting the boolean for each word
			for (int j = 0; j < list.size(); j++) { //it again to compare
				if (i != j && list.get(i).equals(list.get(j))) { //making sure that I am not comparing the same thing
					unique = false;
					break; //stop if statement
				}
			}
			if (unique) { //if it is still unique, increase the count
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
