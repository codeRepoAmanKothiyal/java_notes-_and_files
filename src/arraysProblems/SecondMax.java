package arraysProblems;

import java.util.Scanner;

public class SecondMax {
	
	public void findSecondMax() {
		
		int maxNum=0;
		int secondMax=0;
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 5 Number to find max: ");
		
		for(int i=0; i<=4;i++) {
			a[i]=sc.nextInt();	
		}
         for(int j=0; j<=4;j++) {
			
			if(a[j]>maxNum) {
				maxNum=a[j];
			}
			for(int k=0;k<=4;k++) {
				
				if(maxNum>a[k] && a[k]>secondMax) {
					 secondMax=a[k];
				}
			}
			
		}
         
         System.out.println(secondMax);
		
			
	}
	
	
	public static void main(String[] args) {
		
		
		SecondMax obj = new SecondMax();
		obj.findSecondMax();
		
	}

}
