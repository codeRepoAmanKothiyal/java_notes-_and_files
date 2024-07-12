package javaConditions;

import java.util.Scanner;

public class Vowel_Consonant {
	
	public void get_vowels_Consonant(char ch) {
		
		if(ch=='a' ||ch=='A' || ch=='e' || ch=='E' || ch=='i' ||
				ch=='I' || ch=='o' || ch =='O'|| ch=='u' || ch=='U') {
			
			System.out.println("This is Voul");
		}
		else {
			System.out.println("This is consonant");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Vowel_Consonant vc= new Vowel_Consonant();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any char to check:");
		char ch= sc.next().charAt(0);
		vc.get_vowels_Consonant(ch);
		
	}

}
