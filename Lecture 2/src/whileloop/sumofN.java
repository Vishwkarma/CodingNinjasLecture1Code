package whileloop;

import java.util.Scanner;
public class sumofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		
		for(int i=2;i<=n;i+=2)
		{ 
			sum=sum+i;
			
		}
		System.out.print(sum);
	}

}
