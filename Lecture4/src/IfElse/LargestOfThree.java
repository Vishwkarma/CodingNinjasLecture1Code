package IfElse;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 int a= s.nextInt();
		 int b=s.nextInt();
		 int c= s.nextInt();
//		 
//		 if(a>=b && a>=c) {
//			 System.out.println("a is Largest "+a);
//			 
//		 }else  {
//			 if(b>c && b>a) {
//		 
//			 System.out.println("b is Largest "+ b);
//			 
//		 }else {
//			 
//			 System.out.println(" c is largest");
//		 }

		 
		 if(a>=b && a>=c && a>=c) {// for 10 10 5 is 10 is largesst print not go with another if condition
			 System.out.println("a is Largest "+a);
	}else if(b>=c && b>=a) {
		System.out.println("b is Largest "+b);
		
	}else {
		System.out.println("c is Largest "+c);
	}

}
}