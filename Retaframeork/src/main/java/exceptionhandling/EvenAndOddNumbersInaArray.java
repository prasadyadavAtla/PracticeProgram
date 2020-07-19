package exceptionhandling;

public class EvenAndOddNumbersInaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,5,6};
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		
		}
		
		System.out.println("odd numbers in an array");
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		
		}

	}

}
