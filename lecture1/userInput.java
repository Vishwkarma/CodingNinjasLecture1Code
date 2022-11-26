 
package lecture1;

import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String str=scan.nextLine();// scan.next;// break about the space 
	     System.out.println(str);
	     
	     char c=str.charAt(0);
	     
		int p=scan.nextInt();
		int r=scan.nextInt();
		int t=scan.nextInt();
		
		long l=scan.nextLong();
		 
		float f=scan.nextFloat();
		double d=scan.nextDouble();
		
		
		
		int si=(p*r*t)/100;
		System.out.print(si);
				
	}

}
