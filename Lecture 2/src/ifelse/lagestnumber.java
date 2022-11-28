package ifelse;

import java.util.Scanner;
public class lagestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>=b&& a>=b)
		{
			
			System.out.println("greatest number "+a);
			
		}
		else {
			if(b>=a && b>=c)
			{
				System.out.println("greatest number " +b);
				
			}
			else
			{
				System.out.println("greatest number "+c);
				
			}

	}

}
}

