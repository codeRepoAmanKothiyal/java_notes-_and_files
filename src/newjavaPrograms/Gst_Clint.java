package newjavaPrograms;

import  java.util.*;
public class Gst_Clint {
	
	public static void main(String[] args) {
		CalculatorDemo ob = new CalculatorDemo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the input :");
		float input = sc.nextFloat();
		float output = ob.getGST(input);
		System.out.println(output);
	}
}
