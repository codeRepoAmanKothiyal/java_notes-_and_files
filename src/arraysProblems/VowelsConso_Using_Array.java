package arraysProblems;

import java.util.Scanner;

public class VowelsConso_Using_Array {
	
	public void findVowelsConso() {
		
		char a[]= new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter 5 inputs:");
		
		for(int i=0; i<=4;i++) {
			a[i]= sc.next().charAt(0);
		}
		
		for(int j=0; j<=4;j++) {
			if(a[j]=='a' || a[j]=='e' ||  a[j]=='i'  || a[j]=='o' ||
					 a[j]=='u' ||a[j]=='A'|| a[j]=='E' ||a[j]=='I'|| a[j] =='O'|| a[j]=='U' ) {
				
				System.out.println(a[j]+" is Voul");
			}
			else {
				System.out.println(a[j]+" is consonant");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		VowelsConso_Using_Array obj = new VowelsConso_Using_Array();
		
		obj.findVowelsConso();
		
	}

}
