package newjavaPrograms;

import java.util.*;

public class StudentInfo {
	
	String name,fatherName,collageName,cource;
	long rollNo;
	int english,maths,science,computer,hindi, total;
	float percentage;
	Scanner sc= new Scanner(System.in);	
	
	void studentMarksheet() {
		System.out.println("Please Enter your Details:");
		System.out.print("Enter Your Name : ");
		name= sc.nextLine();
		System.out.print("Enter your Father Name : ");
		fatherName= sc.nextLine();
		System.out.print("Enter Your Collage Name : ");
		collageName = sc.nextLine();
		System.out.print("Enter Your Cource Name : ");
		cource=sc.nextLine();
		System.out.print("Enter your Roll No. : ");
		rollNo=sc.nextLong();
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
		
		
		total = english+maths+science+computer+hindi;
		
		percentage = (total / 500.0f) * 100;
		
		System.out.println("<<<----------Marksheet------------>>>");
		System.out.println("Name:"+name);
		System.out.println("Father Name:"+fatherName);
		System.out.println("Collage:"+collageName);
		System.out.println("Cource:"+cource);
		System.out.println("Roll No:"+rollNo);
		System.out.println("<<<<<<<Marks>>>>>>>");
		System.out.println("English:"+english);
		System.out.println("Maths:"+maths);
		System.out.println("Science:"+science);
		System.out.println("Computer Science:"+computer);
		System.out.println("Hindi:"+hindi);
		System.out.println("----------------------------------");

		System.out.println("PERCENTAGE : "+percentage);
		System.out.println("TOTAL MARKS : "+total);

	}
	
	
	public static void main(String[] args) {
		
		StudentInfo s1 = new StudentInfo();
		s1.studentMarksheet();
	}

}
