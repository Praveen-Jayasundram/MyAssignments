package week1.day2;

public class IsPrimeNumber {

	// range - n;
	// dividing number

	public static void main(String[] args) {

		int n = 23;

		for (int i = 2; i < n; i++) {
			if (n%i == 0) {                           //ex: (23%2==0) >> No
				System.out.println("Number is Not Prime number ");
				return;
			}

		}

		System.out.println("Number is a Prime number "); // if false
	}

}
