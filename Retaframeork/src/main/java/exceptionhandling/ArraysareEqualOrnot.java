package exceptionhandling;

import java.util.Arrays;

public class ArraysareEqualOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,2,3,};
		
		int arr1[]={1,2,3};
		
		boolean  status=Arrays.equals(arr, arr1);
		
		if(status)
		{
			System.out.println("arrays equal");
		}
		
		else
		{
			System.out.println("arrays not  equal");
		}
	//2nd approach	
		
		boolean status1=true;
		if(arr.length==arr1.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=arr1[i])
				{
					status1=false;
				}
			}
		}
		
		else
		{
			status1=true;
		}
		
		if( status1==true)
		{
			System.out.println("the elements in an arrays are equal");
		}
		else
		{
			System.out.println("the elements in an arrays not equal");
			
		}
	}

}
