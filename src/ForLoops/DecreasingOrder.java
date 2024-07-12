package ForLoops;

import java.util.Scanner;

public class DecreasingOrder {
	int i;
	public void decNum(int num) {
		
		if(num<100) {
			for( i=num;i>=0; --i){
         	System.out.println(i);
				
			}
		}else {
			System.out.println("Wrong Input");
		}
		
	}
	
	public static void main(String[] args) {
	
		DecreasingOrder obj = new DecreasingOrder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number : ");
		int num = sc.nextInt();
		obj.decNum(num);
		
	}

}
