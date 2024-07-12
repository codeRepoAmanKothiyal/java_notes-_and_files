package arraysProblems;

import java.util.Scanner;

public class PallindromString {
	
	public void findPallindromString() {
		String rev ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string to find Pallindrom : ");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		char[] f = str.toCharArray();
		
		int size = f.length;
		
		for(int i=size-1;i>=0;--i) {
			rev= rev+f[i];			//System.out.println(rev);
		}
		if(str.equalsIgnoreCase(rev)){
			
			System.out.println(str+" is Pallindrom");
			
		}else {
			System.out.println(str+" is not pallindrom");
		}
	}
	
	public static void main(String[] args) {
		
		
		PallindromString obj = new PallindromString();
		obj.findPallindromString();
	}

}
