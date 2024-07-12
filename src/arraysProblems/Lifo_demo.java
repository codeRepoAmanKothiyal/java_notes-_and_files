package arraysProblems;

import java.util.Scanner;

public class Lifo_demo {
	
	public void getLifo() {
		
		int a[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter 5 inputs:");
		
		for(int i=0; i<=4;i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.println("Lifo is :");
		
		for(int j=4;j>=0;--j) {
			System.out.println(a[j]);
		}
	}
	
	public static void main(String[] args) {
		
		
		Lifo_demo obj = new Lifo_demo();
		obj.getLifo();
	}

}
