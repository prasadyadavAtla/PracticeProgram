package exceptionhandling;

import java.util.Scanner;

public class FactorialOfAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int fact=1;

		Scanner sc=new 	Scanner(System.in);

		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact =fact*i;
		}
		System.out.println("the factorial of a given number is"+fact);
	}

}
