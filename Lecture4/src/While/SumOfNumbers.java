package While;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 int  sum=0;
		  
		 int n=s.nextInt();
		 int i=1;
		 while(i<=n) {
			 
			 sum=sum+i;
			 i=i+1;
		 }
		 System.out.println(sum);
		 

	}

}
