package week3.day1;

public class ReverseTheGivenString {

	public static void main(String[] args) {
	
		String companyName= "TestLeaf";
		
		char[] charArray = companyName.toCharArray();
		
		for (int i = charArray.length-1; i>=0; i--) {
			
			System.out.print(charArray[i]);
			
		}

	}

}
