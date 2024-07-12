package ForLoops;

import java.util.Scanner;

public class StringLoop {
	String s;
	
	public void printStringInLoop() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String: ");
		
		s= sc.nextLine();
		
		for (int i=0; i<=10;i++) {
			System.out.println(s +" "+ i);
		}
	}
	
	public static void main(String[] args) {
		
		
		StringLoop obj = new StringLoop();
		obj.printStringInLoop();
		
	}

}
