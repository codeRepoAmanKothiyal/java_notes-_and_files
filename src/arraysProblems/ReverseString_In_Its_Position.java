package arraysProblems;

import java.util.Scanner;

public class ReverseString_In_Its_Position {
	
	public void getRevString() {
		
		String revStr="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a sentance");
		
		String str = sc.nextLine();
		
		String[]strArray= str.split(" ");
		
		int size = strArray.length;
		
		for (int i=0;i<=size-1;++i) {
			
			char[] cArray =strArray[i].toCharArray();
			
			for(int k=cArray.length-1;k>=0;--k) {
				
				revStr= revStr+cArray[k];
			}
			
			revStr = revStr+" ";	
		}
		System.out.println("Reverse is : "+revStr);
	}

	
	public static void main(String[] args) {
		
		ReverseString_In_Its_Position obj= new ReverseString_In_Its_Position();
		obj.getRevString();
		
		
	}
}
