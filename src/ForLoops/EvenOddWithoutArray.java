package ForLoops;

import java.util.Scanner;

public class EvenOddWithoutArray {
	int i,num1, num2;
	
	public void checkEvenOdd() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1=sc.nextInt();
		System.out.println("Enter Second number");
		num2=sc.nextInt();
		
		
		for(i=num1;i<=num2;++i) {
			if(i%2==0) {
				System.out.println("Number "+ i +" is Even");
			} else {
				System.out.println("Number "+ i +" is Odd ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		EvenOddWithoutArray obj = new EvenOddWithoutArray();
		obj.checkEvenOdd();
	}

}
