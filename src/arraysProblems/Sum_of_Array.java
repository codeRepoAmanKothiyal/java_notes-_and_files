package arraysProblems;

import java.util.Scanner;

public class Sum_of_Array {
	
public void getSumOfArray() {
	
	int sum=0;
		
		int a[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter 5 inputs:");
		
		for(int i=0; i<=4;i++) {
			a[i]= sc.nextInt();
		}
		
		for(int j=0;j<=4;++j) {
			
			sum=sum+ a[j];
			
		}
		System.out.println("Sum of Array is :"+sum);
	}
	
	public static void main(String[] args) {
		
		Sum_of_Array obj = new Sum_of_Array();
		obj.getSumOfArray();
		
	}

}
