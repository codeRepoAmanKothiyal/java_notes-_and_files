package javaConditions;

import java.util.Scanner;

public class Bill_with_gst {
	double gst , totalAmountWithGst;
	
	public void total_bill(int amount) {
		
		if(amount<=1000) {
			
			gst=amount*5/100;
			totalAmountWithGst = gst+amount;
			System.out.println("Gst is 5% which is :"+gst);
			System.out.println("Total Amount with gst: "+totalAmountWithGst);
		}
		else if(amount>1000 && amount <=2000) {
			gst=amount*10/100;
			totalAmountWithGst = gst+amount;
			System.out.println("Gst is 10% which is :"+gst);
			System.out.println("Total Amount with gst: "+totalAmountWithGst);
		}
		else {
			gst=amount*18/100;
			totalAmountWithGst = gst+amount;
			System.out.println("Gst is 18% which is :"+gst);
			System.out.println("Total Amount with gst: "+totalAmountWithGst);
		}
		
	}
	
	public static void main(String[] args) {
		
		Bill_with_gst obj = new Bill_with_gst();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Amount :");
		int amount = sc.nextInt();
		obj.total_bill(amount);
		
		
	}

}
