package lecture1;

import java.util.Scanner;

public class Add2Numbers {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		 
//		 String str="abcd";
//		 System.out.println(str);
		 
		 String str1=scan.nextLine();
		// System.out.println(str1);
		 
		 char c= str1.charAt(2);
		 System.out.println(c);
		 
		 int i=scan.nextInt();
		 int j=scan.nextInt();
		 
		 int z= i+j;
		 
		 System.out.println(z);
		 
		
	}

}
