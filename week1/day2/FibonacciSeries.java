package week1.day2;

public class FibonacciSeries {
	
	        //User input for the desired range of the Fibonacci series is 8.
			//output – 0, 1, 1, 2, 3, 5, 8, and 13

	public static void main(String[] args) 
	{
		int range=8;
		int firstNumber=0;
		int secondNumber=1;
		int thirdNumber;
		
		for(int i=0; i<range;i++)                     // 0 ; 0 < 8; 0++ >> True  (Loop works every time until the range)
		{
			System.out.println(firstNumber);         //  Print 0 (First number)
			thirdNumber=firstNumber+secondNumber;  // third number = 0 + 1 = 1 (First + Second number)
			firstNumber=secondNumber;              // First number = 1 (Second number)
			secondNumber=thirdNumber;	           // Second number = 1 (Third number)
		}		
	}

}
