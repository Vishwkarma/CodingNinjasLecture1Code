package ForLoop;

import java.util.Scanner;

public class powerNumber {

	public static void main(String[] args) {
		
		int x,n,pow=1;
		
		Scanner s = new Scanner(System.in);
		
		x=s.nextInt();
	    n=s.nextInt();
	    
	    for(int i=1;i<=n;i++) {
	    	pow=pow*x;
	    	
	    }
	    
	    System.out.println(pow);

	}

}
