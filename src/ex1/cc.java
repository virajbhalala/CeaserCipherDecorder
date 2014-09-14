//Viraj Bhalala
//This project converts Englisht to Ceaser Cypher


package ex1;
import java.util.Scanner;

public class cc {
	public static void main(String[] args) {
		System.out.println ("Enter Encryption: ");
		Scanner scanner =new Scanner (System.in);
		String s = scanner.nextLine();	
			
		System.out.println (translator(s));

	}
	public static String translator(String s){
		String temp = "";
		for (int i =0; i<s.length(); i++){
			if(s.charAt(i)==' '){
				temp += ' ';
			}
			else if(s.charAt(i)=='!'){
				temp += '!';
			}
			else if(s.charAt(i)=='x'){
				temp += 'a';
			}
			else if(s.charAt(i)=='X'){
				temp += 'A';
			}
				
			else if(s.charAt(i)=='Y'){
				temp += 'B';
			}
			
			else if(s.charAt(i)=='y'){
				temp += 'b';
			}
			else if(s.charAt(i)=='Z'){
				temp += 'C';
			}
			
			else if(s.charAt(i)=='z'){
				temp += 'c';
			}
			//do same thing for y andz
			else{
				temp += (char)(s.charAt(i) + 3);
				}
				
			}
		return temp;
	}
	
	
	
}

