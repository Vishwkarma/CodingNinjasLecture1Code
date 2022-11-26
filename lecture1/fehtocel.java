package lecture1;

import java.util.Scanner;
public class fehtocel {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		int fah=scan.nextInt();
//		
//		//int cel=(5*(fah-32))/9;
//		int cel=(int)((5.0/9)*(fah-32));//(5.0/9)*(fah-32) is double 
//		System.out.println(cel);
		
		System.out.println(9/5);
		System.out.println(9.0/5);//it gives double why double is divided by int
		
		System.out.println(9+5);
		System.out.println(9-5);
		System.out.println(9/5);
		System.out.println(9*5);
		System.out.println('a'/5);
		
		
		System.out.println(9%5);
		
		System.out.println('A'+1);//Ascii value of A is 65
		System.out.println('a'+'b');
		char c='a';
		char i=(char)(c+3);//expility typecast
		System.out.println(i);
		 
		
		
		
		

	}

}
