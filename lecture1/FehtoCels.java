package lecture1;

import java.util.Scanner;

public class FehtoCels {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f= s.nextInt();
		
		//int cel=(5/9)*(f-32);wrong its gives 0
		//int cel= (5*(f-32))/9;//it is 1 way to write 
		
		
		int cel = (int)((5.0/9)*(f-32));//implicit write in integer before it give double value
		System.out.println(cel);

	}

}
