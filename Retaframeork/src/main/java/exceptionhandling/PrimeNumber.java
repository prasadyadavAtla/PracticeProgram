package exceptionhandling;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);

		int n=sc.nextInt();
		
		boolean prime=true;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				//System.out.println("given number is prime");
				
				prime =false;
				
				break;
			}
			
			
		}
		
		if(prime==false)
		{
			System.out.println("given number is not prime");
		}
		
		else
		{
			System.out.println("given number is  prime");
		}
		
		

	}

}
