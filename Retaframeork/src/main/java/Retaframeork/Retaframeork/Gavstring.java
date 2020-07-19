package Retaframeork.Retaframeork;

public class Gavstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string constant pool
		String s1="ratan";
		

		String s2="anu";
		
		String s3="ratan";
		System.out.println(s1==s2);

		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		//new operator
		String str1=new String("ratan");
		
		String str2=new String("anu");
		
		String str3=new String("ratan");
		System.out.println("&&&&&&&&&&&");
		System.out.println(str1==str3);

		System.out.println(str1==str2);
		System.out.println(str2==str3);
		
		StringBuffer sb1=new StringBuffer("ratan");
		
		StringBuffer sb2=new StringBuffer("anu");
		
		StringBuffer sb3=new StringBuffer("ratan");
		
		System.out.println(sb1==sb3);

		System.out.println(sb2==sb3);
		System.out.println(sb1==sb2);
		

	}

}
