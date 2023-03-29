package mypackage;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line of text :");
		String str = s.nextLine();
		int vowels = 0,consonant = 0,words = 1;
		
		for(int i = 0;i <str.length();i++) {
			
			switch(str.charAt(i)) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' : vowels++; break;
			case ' ' : words++; break;
			default : consonant++;
			}
		}
		System.out.println("Number of vowels in line :" + vowels);
		System.out.println("Number of words in line : " + words);
		System.out.println("Number of consonants in line : " + consonant);
		

	}

}
