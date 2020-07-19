package exceptionhandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceOfCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str="java programming java oops";

		Map<Character,Integer> hm=new HashMap<Character,Integer>();


		char[] ch =str.toCharArray();

		for(char c:ch)
		{
			if(!hm.containsKey(c))
			{
				hm.put(c, 1);
			}

			else
			{
				hm.put(c,hm.get(c)+1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entryset =hm.entrySet();
		
		for(Map.Entry<Character,Integer> entry:entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+""+entry.getValue());
			}
			
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey()+""+entry.getValue());
			}
		}



}
}
