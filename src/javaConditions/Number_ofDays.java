package javaConditions;

import java.util.Scanner;

public class Number_ofDays {
	int year;
	Scanner sc = new Scanner(System.in);
	public void check_no_day_with_leapYear(String month) {
		
		if(month.equalsIgnoreCase("january") || month.equalsIgnoreCase("march")||
				month.equalsIgnoreCase("may")|| month.equalsIgnoreCase("july")||
				month.equalsIgnoreCase("August") || month.equalsIgnoreCase("october")||
				month.equalsIgnoreCase("december")
				) {
			System.out.println(month +" having 31 Days");
		}else if(month.equalsIgnoreCase("february")) {
			System.out.println("Please Enter year:");
			year = sc.nextInt();
			if((year%400 ==0)||(year%100!=0) && (year%4 ==0)) {
				System.out.println("This is leap Year han having 29 days");
			}
			else {
				System.out.println("This is normal year Having 28 days");
			}	
		}else if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("june")||
				month.equalsIgnoreCase("september")|| month.equalsIgnoreCase("november")){
			System.out.println(month+" hava 30 days");
		}
	}
	
	public static void main(String[] args) {
		
		Number_ofDays obj = new Number_ofDays();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month name : ");
		String month = sc.nextLine();
		obj.check_no_day_with_leapYear(month);
	}
	

}
