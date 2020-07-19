package exceptionhandling;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] fib=new int[10];
		
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2; i<10;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		for(int i=0; i<10;i++)
		{
			System.out.println(fib[i]);
		}

	}

}
