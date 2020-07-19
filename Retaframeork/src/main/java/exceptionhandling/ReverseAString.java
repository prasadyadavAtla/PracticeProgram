package exceptionhandling;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using String concatination operator

		Scanner sc =new Scanner(System.in);

		String 	tr=sc.nextLine();
		
		
		
		String revere="";
		
		for(int i=tr.length()-1;i>=0;i--)
		{
			revere=revere+tr.charAt(i);
			
			
		}
		
		System.out.println(revere);
	char[] ch=	tr.toCharArray();
	
	for(int i=ch.length-1;i>=0;i--)
	{
		revere=revere+ch[i];
		
	}
	
	System.out.println(revere);
	}

}
