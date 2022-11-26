package lecture1;

public class DivideNumber {
	
	public static int divideNumber(int num,int deno) {
		if(deno==0) {
			return Integer.MIN_VALUE;
		}
		System.out.println("inside division function");
		return num/deno;
	}
  
	public static void printDivisonResult(int num,int deno) {
		if(deno==0) {
			//exit the function
			return;
		}
		System.out.print(num/deno);
	}
	

	public static void main(String[] args) {
		int num=9;
		int deno=2;
		int result =divideNumber(num,deno);
		System.out.println(result);
		if(result > 0) {
			
			
		}else {
			
			
		}
		printDivisonResult(num,deno);//do not the collect the value
		
		

	}

}
