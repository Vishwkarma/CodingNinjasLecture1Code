package ifelse;

import java.util.Scanner;

public class ifpart {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		int rem=n%2;
		
		if(rem==0) {
			
		System.out.println("true");
		return ;
		//we terminate are program
		}
		
		System.out.println("odd");
		
	}

}
