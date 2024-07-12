package arraysProblems;

import java.util.Scanner;

public class Count_Every_Char {
	
	public void countChar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any String:");
		String str = sc.nextLine();
		

		str=str.toLowerCase();
		char[] f = str.toCharArray();
		
		int size = f.length;
		
		for(int i=0;i<=size-1;++i) {
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		Count_Every_Char obj = new Count_Every_Char();
		obj.countChar();
		
	}

}
