package javaConditions;

import java.util.Scanner;

public class Marksheet_check {
	int totalMarks, english, hindi, maths, science, computer;
	float percentage;
	Scanner sc= new Scanner(System.in);	
	public void check_divison() {
		System.out.print("Enter your English Marks:");
		english=sc.nextInt();
		System.out.print("Enter your Maths Marks:");
		maths=sc.nextInt();
		System.out.print("Enter your Science Marks:");
		science=sc.nextInt();
		System.out.print("Enter your Computer Science Marks:");
		computer=sc.nextInt();
		System.out.print("Enter your Hindi Marks:");
		hindi=sc.nextInt();
		
		totalMarks = english+maths+science+computer+hindi;
		percentage = (totalMarks / 500.0f) * 100;

		if(english<=32 || hindi<=32 || maths<=32 || science<= 32 || computer<=32 ) {
			
			System.out.println("yor are fail");
		}
		else {
			if(percentage<=32) {
				System.out.println("you are fail");
			}
			else if(percentage>32 && percentage<=45) {
				System.out.println("you got 3rd Divison");
			}else if(percentage>45 && percentage<=60) {
				System.out.println("you got 2nd Divison");
			}else if(percentage>60 && percentage<=100) {
				System.out.println("you got First Divison");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Marksheet_check obj = new Marksheet_check();
		obj.check_divison();
		
	}

}
