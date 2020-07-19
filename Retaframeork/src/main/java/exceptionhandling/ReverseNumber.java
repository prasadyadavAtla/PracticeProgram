package exceptionhandling;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc =new Scanner(System.in);

		int num=sc.nextInt();
		
		int reverse=0;
		
		while(num!=0)
		{
			reverse=reverse*10+num%10;
			
			num=num/10;
		}
		
		System.out.println("rverse a number"+reverse);
	}

}
