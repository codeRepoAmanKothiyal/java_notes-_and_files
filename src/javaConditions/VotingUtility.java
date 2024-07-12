package javaConditions;

import java.util.Scanner;

public class VotingUtility {
	
	public void getage(int age) {
		
		if(age<18) {
			System.out.println("your age is :"+age +", you are  not Elegible");
		}
		else if(age>=18) {
			System.out.println("your age is :" +age +", you are Elegible");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		VotingUtility vu = new VotingUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age to check elegiblity:");
		int age = sc.nextInt();
		vu.getage(age);
	}
	

}
