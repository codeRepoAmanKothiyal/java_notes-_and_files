package arraysProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd_count {
	
	public void getEvenOddCount() {
		int evenCount=0 , oddCount=0;
	//	ArrayList<Integer> even=new ArrayList<>();
	//	ArrayList<Integer> odd=new ArrayList<>();
		// ArrayList are use to store data in array when we don't know the size of array.
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Number in Array:");
		
		
		for (int i=0; i<=4;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int j=0; j<=4;j++) {
			if(a[j]%2 ==0) {
				evenCount++;
				System.out.println(a[j]+" is Even");
//				even.add(a[j]);
			}else {
				oddCount++;
				System.out.println(a[j]+" is odd");
//				odd.add(a[j]);
			}
		}
		System.out.println("Count of Even Numbers is: "+evenCount);
		System.out.println("Count of Odd Numbers is : "+oddCount);
//		for(int i:even)
//		{
//			System.out.println("Count of even Numbers is : "+i);
//		}
//		for(int j:odd)
//		{
//			System.out.println("Count of Odd Numbers is : "+j);
//		}
		
	}
	
	public static void main(String[] args) {
		
		
		EvenOdd_count obj = new EvenOdd_count();
		obj.getEvenOddCount();
		
	}

}
