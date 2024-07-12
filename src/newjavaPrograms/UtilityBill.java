package newjavaPrograms;

import java.util.*;

public class UtilityBill {
	String name, productName;
	long modileNo;
	float productPrice, GST, totalPrice;
	
	void calculatePriceWIthGST() {
		
		System.out.println("Please enter Details:");
		System.out.print("Please enter Name:");
		name= sc.nextLine();
		System.out.print("Please enter Product Name:");
		productName = sc.next();
		System.out.print("Please enter Product price:");
		productPrice =sc.nextFloat();
		
		GST=productPrice*18/100;
		totalPrice=productPrice+GST;
		System.out.println("total GST: Rs "+GST);
		System.out.println("total Price : Rs "+totalPrice);
			
	}
	
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		UtilityBill obj = new UtilityBill();
		obj.calculatePriceWIthGST();
		
	}

}
