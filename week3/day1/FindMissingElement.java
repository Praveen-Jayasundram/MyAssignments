package week3.day1;

import java.util.Iterator;

public class FindMissingElement {

	public static void main(String[] args) {

		int num[] = { 1, 4, 3, 2, 8, 6, 7 };

		int n = 8;

		for (int i = 0; i <= n; i++) {

			boolean found = false;

			for (int j = 0; j < num.length; j++) {

				if (num[j] == i) {
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("the missing value is : " + i);
			}

		}

	}

}
