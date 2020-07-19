package exceptionhandling;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc =new Scanner(System.in);

		String 	tr=sc.nextLine();

		String original=tr;



		String revere="";

		for(int i=tr.length()-1;i>=0;i--)
		{
			revere=revere+tr.charAt(i);


		}

		System.out.println(revere);

		if(tr.equals(revere))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");

		}
	}

}
