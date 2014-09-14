//Viraj Bhalala
//This project converts Englisht to Ceaser Cypher


package ex1;
import java.util.Scanner;


public class cc {

private static final String[][] String = null;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int stringSize = input.length();
		char[] storage = new char [stringSize];
		
		
		
		//get each char in original string (using for loop) and replace it with char with 3 increments (exculde punctuation) xyz->abc
		for (int x= 0; x<stringSize; x++)
		{
			
			char character = input.charAt(x);
			
			if(character == 'X'){
				character = 'A';
				storage [x] = character;
			}
			
			else
					if(character == 'Y'){
				character = 'B';
				storage [x] = character;
			}
			else 
				if(character == 'Z'){
				character = 'C';
				storage [x] = character;
			}
			else
					if(character == 'x'){
				character = 'a';
				storage [x] = character;
			}
			else
					if(character == 'y'){
				character = 'b';
				storage [x] = character;
			}
			else
					if(character == 'z'){
				character = 'c';
				storage [x] = character;
			}
			else 
				if (character >='a'&&character <='w' ){
				character++;
				character++;
				character++;
				storage [x] = character;
			}
			else
				if (character >='A'&&character <='W' ){
				character++;
				character++;
				character++;
				storage [x] = character;
			}
			
				
			
			else
					if (character >='['&&character <='`' ){
				
				storage [x] = character;
			}
			else	if (character >='{'&&character <='~' ){
				
				storage [x] = character;
			}
			else if (character >='!'&&character <='@' ){
				
				storage [x] = character;
			}
			
			else  if (character ==' ' ){
				
				storage [x] = character;
			}
			
			
			}
			
	
		
		String modifiedString = new String(storage);
		System.out.println(modifiedString);
		
		
	}

}
