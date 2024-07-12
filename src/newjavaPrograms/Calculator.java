package newjavaPrograms;

import java.util.*;

public class Calculator {
	
	int a, b, c;
	Scanner sc = new Scanner(System.in);
	
	void add() {
		System.out.println("please enter two NO. for Adition:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition is :"+c);
	}
	
	void sub() {
		System.out.println("Please Enter two NO. for sub:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("subtraction is :"+c);
	}
	
	void multi() {
		System.out.println("Please Enter two NO. for multiplication:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("Multiplication is :"+c);
	}
	
	void div() {
		System.out.println("Please Enter two NO. for div:");
		float d= sc.nextFloat();
		float e= sc.nextFloat();
		float f= d/e;
		System.out.println("Divison is :"+f);
	}
	
	public static void main(String[]args) {
		
		Calculator obj = new Calculator();
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();
		
	}

}
