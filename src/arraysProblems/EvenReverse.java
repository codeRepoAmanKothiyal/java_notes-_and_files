package arraysProblems;

import java.util.Scanner;

public class EvenReverse {
	
	public void findCountIsEven() {
		int count=0;
		String revStr="";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		char[] f = str.toCharArray();
		
		int size = f.length;
		
		for(int i=size-1; i>=0;--i) {
			count++;
			revStr= revStr+f[i];
			
		}
		
		if(count%2!=0) {
			System.out.println("count is odd So Reverse String is : "+revStr);
		}else {
			System.out.println("count is even and String is : "+str);
		}
		
	}
	
	public static void main(String[] args) {
		
		EvenReverse obj = new EvenReverse();
		obj.findCountIsEven();
		
	}

}
