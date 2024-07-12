package arraysProblems;

import java.util.Scanner;

public class MaxNum {
	
	public void getMaxNum() {
		int maxNum=0, minNum=0;
		
		
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 10 Number to find max: ");
		
		for(int i=0; i<=9;i++) {
			a[i]=sc.nextInt();
			minNum=a[0];
		}
		
		for(int j=0; j<=9;j++) {
			
			if(a[j]>maxNum) {
				maxNum=a[j];
			}
			if(a[j]<minNum) {
				minNum =a[j];
			}
			
		}
		System.out.println("Gratest Number of Array is: "+maxNum);
		System.out.println("Smallest Number of Array is: "+minNum);
		
		
	}
	
	public static void main(String[] args) {
		
		MaxNum obj = new MaxNum();
		obj.getMaxNum();
	}

}
