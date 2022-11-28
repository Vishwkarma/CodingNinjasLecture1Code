package ifelse;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		if(n%2==0) {
			System.out.println("even");
			
		}else {
			
			System.out.println("odd ");
		}
		System.out.println("ye bhi print hoga ");
		return;// termiate the program
}
}