package Retaframeork.Retaframeork;

public class Stmanipulation {

	Stmanipulation(String str)
	{

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//

		Stmanipulation t1=new Stmanipulation("ratan");

		Stmanipulation t2=new Stmanipulation("ratan");
		System.out.println(t1.equals(t2));

		String str1=new String("ratan");

		String str2=new String("ratan");
		System.out.println(str1.equals(str2));
		
		
		StringBuffer sb1=new StringBuffer("ratan");
		

		StringBuffer sb2=new StringBuffer("ratan");
		
		System.out.println(sb1.equals(sb2));

	}

}
