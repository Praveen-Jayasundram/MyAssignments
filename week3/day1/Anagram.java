package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "stops";
		String str2 = "potss";

		// Check if the lengths of the two strings are equal

		if (str1.length() == (str2).length()) {
			System.out.println("Lengths are equal, continuing...");

			// Convert both the strings to character arrays

			char[] sOne = str1.toCharArray();
			char[] sTwo = str2.toCharArray();

			// Sort both the character arrays

			Arrays.sort(sOne);
			Arrays.sort(sTwo);

			if (Arrays.equals(sOne, sTwo)) {
				System.out.println("The given strings are Anagram");
			}

			else {
				System.out.println("The given strings are not an Anagram");
			}

		}

		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			System.exit(0); // Exit the program
		}

	}

}
