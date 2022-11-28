package Scope;

public class Scope1 {

	public static void main(String[] args) {
		int i=10;
		System.out.print(i);
		
		
		//int i=12;// system confuse java doesnot allow
		if(i==10) {
		int n=23;
		System.out.println(23);

	}
		//Systrem.out.println(n);
		int n=4;
		
	    i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
