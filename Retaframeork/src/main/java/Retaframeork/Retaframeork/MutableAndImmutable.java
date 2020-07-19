package Retaframeork.Retaframeork;

public class MutableAndImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ratan";
		
		s1.concat("soft");
		
		System.out.println(s1);
		
		s1=s1.concat("soft");
		
		System.out.println(s1);
		
		StringBuffer sb1=new StringBuffer("ratan");
		
		sb1.append("babu");
		
		System.out.println(sb1);

	}

}
