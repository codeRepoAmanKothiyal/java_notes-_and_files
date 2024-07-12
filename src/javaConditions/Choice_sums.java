package javaConditions;

import java.util.*;

public class Choice_sums {
	
	int num1, num2, button;
	float total;
	public void sums() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first No. : ");
		num1 = sc.nextInt();
		System.out.println("Enter second No. : ");
		num2 = sc.nextInt();
		
		System.out.println("Enter Any Number 1-4 for maths oprations: ");
		button = sc.nextInt();
		
		if(button == 1) {
			total= num1+num2;
			System.out.println("Addition is : "+total);
		}else if(button == 2) {
			total = num1-num2;
			System.out.println("sub is : "+total);
		}else if(button ==3) {
			total = (float) num1 / num2;
			System.out.println("Div is: "+total);
		}else if(button ==4) {
			total = num1*num2;
			System.out.println("multi is: "+total);
		}else {
			System.out.println("wrong choice");
		}
		
	}

	
	public static void main(String[] args) {
		
		Choice_sums obj = new Choice_sums();
		obj.sums();
	}
}
