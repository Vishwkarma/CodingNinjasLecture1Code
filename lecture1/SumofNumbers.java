package lecture1;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum= sum + i;
			
			
		}
		
		System.out.println(sum);
		

	}

}
