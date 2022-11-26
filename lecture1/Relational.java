package lecture1;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		
	boolean isEq=	i==j;
	boolean nEq=(i!=j);
	boolean isGr =(i>j);
	boolean isGreq =(i>j);
	boolean isLess =(i>=j);
	boolean isLesseq=(i<j);

	System.out.println(" Is Equal :"+ isEq);
	System.out.println(" Is not Equal :" +nEq);
	System.out.println(" Is Greater Equal :" +isGr);
	System.out.println(" Is Greater thsn and Equal :" +isGreq);
	
	System.out.println("is Less Than :"+isLess);
	System.out.println(" is Less Equal :"+isLesseq);

	}

}
