package ForLoops;

import java.util.Scanner;

public class PrimeNumber {
	
	public void FindPrimeOrNot() {
		
		int flag=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a Number :");
		int num = sc.nextInt();
		
		if(num==1 || num==0) {
			System.out.println(num+" is not prime");
		}else {
			for(int i=2;i<=num-1;++i) {
				if(num%i==0) {
					flag=1;
					System.out.println(num+" is not prime");
					break;
				}
			}
			if(flag==0) {
				System.out.println(num +" is prime");
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		PrimeNumber pn = new PrimeNumber();
		pn.FindPrimeOrNot();
	}

}
