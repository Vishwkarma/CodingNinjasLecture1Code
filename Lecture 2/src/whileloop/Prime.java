  package whileloop;


import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int n=s.nextInt();// take that we check it prime or not 
		int d=2;
		
		
		while(d<=n-1) {
			if(n%d==0) {
			System.out.println("not prime ");
			return ;
				
			}  d=d+1;
		}
			 
				
				System.out.println("Prime ");
			}
		}
		
	
//		int n=s.nextInt();
//		
//		int d =2;
//		while (d<=n-1)
//		{
//			if(n%d==0) {
//			 System.out.println("not prime");
//			 return ;
//			 
//			}
//			d= d+1;
//		}
//		System.out.println("prime ");
//		
//
//	}

