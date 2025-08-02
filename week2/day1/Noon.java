package week2.day1;

public class Noon {

	public static void main(String[] args) {

/* 
  Keep to remember: 
       How we can break a given  decimal number ?-ex: 1000 (thousand )  we need value 10.
       What is / and % operator and what it's store ? 
       % - called ( Modulus or Remainder Operator ) >> Gets the remainder after division 10 % 3	= 1
       / - called Division Operator >> Performs division 10 / 3	= 3
   how to achieve palindrome number = reverse the number then compare it like actual==Reverse; 
 */

		int num = 1341; // input number
		int rem; // remainder
		int rev = 0; // reverse
						                               // int actual = num; // temp - for while loop

		for (int i = num; i > 0; i = i / 10) {
			rem = i % 10;
			rev = (rev * 10) + rem;
			                                                // num=num/10; // while loop logic
		}

		if (num == rev) {
			System.out.println("Given number is palindrome number: " + num);

		} else {
			System.out.println("Given number is not a palindrome number " + num);
		}

		
		
		
		
		
		/*
		 * Using while loop
		 * 
		 * while(num>0) { rem=num%10; rev=(rev*10)+rem; num=num/10; } if (actual==rev) {
		 * System.out.println("Given number is palindrome number: " + rev); } else {
		 * System.out.println("Given number is not a palindrome number " +rev); }
		 */
	}

}
