package IfElse;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		int rem=n%2;
		
		if(rem==0) {
			 System.out.println("Even");
			 
			 return;// terminate our program
			 
		}
			System.out.println("Odd");
		}
		
	}

