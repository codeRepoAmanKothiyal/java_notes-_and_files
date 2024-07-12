package arraysProblems;

import java.util.Scanner;

public class CountChar {
	
	public void getCount() {
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any String: ");
		String str= sc.nextLine();
		
		str=str.toLowerCase();
		char[] f = str.toCharArray();
		
		int size = f.length;
		
		System.out.println("please Enter any char");
		
		char a= sc.next().charAt(0);
		a= Character.toLowerCase(a);
		for(int i=0;i<=size-1;++i) {
			
			if(f[i]==a) {
				count++;
			}
		}
		System.out.println("counto is : "+count);
	}
	
	public static void main(String[] args) {
		
		CountChar obj = new CountChar();
		obj.getCount();
	}

}
