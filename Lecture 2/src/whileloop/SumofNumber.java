package whileloop;

import java.util.Scanner;

public class SumofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
       int n =s.nextInt();
        int i=1;     //next num to be added 
      int  sum=0;
      while (i<=n)
       { sum= sum+i;
      i= i+1;
     
       }
      System.out.println(sum);
	}

}
