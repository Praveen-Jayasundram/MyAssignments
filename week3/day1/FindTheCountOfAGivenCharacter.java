package week3.day1;

public class FindTheCountOfAGivenCharacter {

	public static void main(String[] args) {
		
		String input="TestLeaf";
		
		int target =0;
		
		char[] charArray = input.toCharArray();
		
		System.out.println(charArray);
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i]=='e')
			{
				target++;
			}
			
		}
		
		System.out.println(target);
		
		
		
		
		
		

	}

}
