package exceptionhandling;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);

		int num=sc.nextInt();
		
		int original =num;
		
		int reverse=0;
		
		while(num!=0)
		{
			reverse=reverse*10+num%10;
			
			num=num/10;
		}
		
		System.out.println("rverse a number"+reverse);
		
		if(original==reverse)
		{
			System.out.println("given number palindrome");
		}
		
		else
		{
			System.out.println("given number  not palindrome");
		}

	}

}
