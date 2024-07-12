package javaConditions;

import java.util.Scanner;

public class FindDays {
	
	public void dayFinder(String day) {
		
		if(day.equalsIgnoreCase("sunday")) {
			System.out.println("Weekend");
		}else if(day.equalsIgnoreCase("monday")){
			System.out.println("first day of week");
		}else if(day.equalsIgnoreCase("tuesday")){
			System.out.println("2nd day of week");
		}else if(day.equalsIgnoreCase("wednesday")){
			System.out.println("3rd day of week");
		}else if(day.equalsIgnoreCase("thrusday")){
			System.out.println("4th day of week");
		}else if(day.equalsIgnoreCase("friday")){
			System.out.println("5th day of week");
		}else if(day.equalsIgnoreCase("saturday")){
			System.out.println("weekend");
		}else {
			System.out.println("Wrong Input");
		}
	}
	
	public static void main(String[] args) {
		
		FindDays obj= new FindDays();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any day of week:");
		String day= sc.nextLine();
		obj.dayFinder(day);
	}

}
