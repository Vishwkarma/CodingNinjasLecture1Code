import java.util.Scanner;

public class Palimdrome {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		int m,r,rev=0;
		
		m=n;
		
		while(n!=0) {
			
			r=n%10;
			rev=rev*10+r;
			n=n/10;	
			
		}
		System.out.println(rev);
		if(m==rev) {
			System.out.print("Palimdrome");
			
		}else {
			System.out.print("Not Palimdrome");
		}
		
		
				

	}

}
