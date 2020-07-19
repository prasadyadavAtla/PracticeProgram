package exceptionhandling;

import java.util.Scanner;

public class ReverseAstringUsingbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);

		int num=sc.nextInt();
		
		StringBuffer b=new StringBuffer(String.valueOf(num));
		
		StringBuffer reverse=b.reverse();
		System.out.println(reverse);
		

	}

}
