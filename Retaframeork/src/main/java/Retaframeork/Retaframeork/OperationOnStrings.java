package Retaframeork.Retaframeork;

public class OperationOnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ratan";
		
		char ch=s1.charAt(0);
		
		System.out.println(ch);
		
		int inde=s1.length();
		
		System.out.println(inde);
		
		int la=s1.indexOf('a');
		
		System.out.println(la);
		
		int li=s1.lastIndexOf('a');
		
		System.out.println(li);
		
		String s="   hi ratan babu ";
		
		boolean value=s.startsWith("hi");
		
		System.out.println(value);
		
		boolean value1=s.endsWith("u");
		

		System.out.println(value1);
		
		boolean value3=s.contains("an");
		
		System.out.println(value3);
		
		String q=s.trim();
		
		System.out.println(q);
		
		System.out.println(s.trim().length());
		
		
		System.out.println(s.split(" "));
		
	}

}
