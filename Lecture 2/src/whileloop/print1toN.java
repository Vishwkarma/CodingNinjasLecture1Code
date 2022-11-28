package whileloop;


import java.util.Scanner;
public class print1toN {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int i=1;
		
		while(i<=n) {
			System.out.println(i);
			//if do not do it infinite loop works 
			i+=1;
			
//		// TODO Auto-generated method stub
//		Scanner s =new Scanner(System.in);
//		int n=s.nextInt();
//		
//		
//		int i=1;
//		
//		while(i<=n) {
//		System.out.println(i);
//		//i=i+1; it come on the infinite loop

	}

}
}