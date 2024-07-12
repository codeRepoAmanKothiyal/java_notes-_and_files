package newjavaPrograms;

import java.util.Scanner;

public class CalculatorDemo {
	
	public float getGST(float gst) {
		float gst1 =(gst*18)/100;
		return  gst1;
	}
	
	public static void main(String[] args) {
		
		CalculatorDemo cd = new CalculatorDemo();
		Scanner sc= new  Scanner(System.in);
		System.out.println("Please enter your amount :");
		float input =sc.nextFloat();
		float out = cd.getGST(input);
		System.out.println(out);
		
	}
}