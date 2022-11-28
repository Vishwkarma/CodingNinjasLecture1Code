package IfElse;

import java.util.Scanner;

public class TotalSalary {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		 int basic = s.nextInt();
		 char grade=s.next().charAt(0);
		 
		 double hra=0.2*basic;
		 double da =0.5*basic;
		 
		 int allowance ;
		 if(grade =='A') {
			 allowance=1700;
		 }else if(grade =='B') {
			 
			 allowance=1300;
		 }
         double pf =0.11*basic;
         
         double totalSalary =basic+hra +da + -pf;
         int ans=(int) Math.round(totalSalary);
         
         System.out.println(ans);
         
		}

}
