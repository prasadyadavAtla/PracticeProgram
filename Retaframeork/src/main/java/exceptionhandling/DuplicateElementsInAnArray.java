package exceptionhandling;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInAnArray {
	
	public static void main(String[] args) {
		
		String[] str={"java","c","c++","python","java"};
		
		Set<String> et=new HashSet<String>();
		
		for(String a:str)
		{
			if(et.add(a)==false)
			{
				System.out.println("In a given arry have the duplicates ");
			}
			
			else
			{
				System.out.println("In a given arry have no the duplicates ");
			}
		}
		
		
	}

}
