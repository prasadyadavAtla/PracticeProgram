package exceptionhandling;

import java.util.Scanner;

public class SumOfNdigitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);

		int num=sc.nextInt();
		
		int sum=0;
		
		while(num>0)
		{
			sum =sum+ num%10;
			
			num=num/10;
		}
		System.out.println("the total sum" +sum);
		
	}

}
