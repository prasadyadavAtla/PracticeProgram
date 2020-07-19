package exceptionhandling;

public class SumOfElementsinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={10,0,30,40,50};

		int sum=0;

		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of array elements"+sum);
		
		for(int value:a)
		{
			//System.out.println("sum of array elements"+sum);
			sum=sum+value;
		}
		
		System.out.println("sum of array elements"+sum);
	}



}
