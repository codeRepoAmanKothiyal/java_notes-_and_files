package ForLoops;

import java.util.Scanner;

public class Tables {
	
	int result, i;
	
	public void createTable(int num) {
		
		for(i=1; i<=10; ++i) {
			result =num*i;
			System.out.println(num+"*"+i+"="+ result);
		}
	
		
	}
	
	public static void main(String[] args) {
	
		
		Tables obj = new Tables();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		obj.createTable(num);
		
		
	}

}
