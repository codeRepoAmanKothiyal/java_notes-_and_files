package arraysProblems;
import java.util.Scanner;

public class SimilarString {
	
	public void reverse(String str) {
		
		String revStr="";
		
      char[] f = str.toCharArray();
		
		int size = f.length;
		
		for(int i=size-1; i>=0;--i) {
			revStr= revStr+f[i];
			
		}
		System.out.println(revStr);
	}
	
	public void findSimilarOrNot() {
		
		int flag=0;
		String revStr1="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter First String: ");
		String str1 = sc.nextLine();
		System.out.println("Please enter 2nd String:");
		String str2 = sc.next();
		
		String[]strArray1= str1.split(" ");
		
		for(int i=0;i<=strArray1.length-1;i++) {
			
			if(strArray1[i].equalsIgnoreCase(str2)) {
				flag =1;
			}	
		}
		
		//System.out.print(flag);
		
		if(flag==1) {
			reverse(str2);
		}else {
			reverse(str1);
		}
		
	}
	
	public static void main(String[] args) {
		
		SimilarString obj = new SimilarString();
		obj.findSimilarOrNot();
	}

}
