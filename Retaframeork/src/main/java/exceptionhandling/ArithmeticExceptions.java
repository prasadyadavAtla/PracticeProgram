package exceptionhandling;

public class ArithmeticExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String literal
		String s1="javapra";//creating string by java string literal

		//character array
		char ch[]={'s','t','r','i','n','g','s','p',20,30};  


		String s2=new String(ch);//converting char array to string

		//new keyword
		String s3=new String("exampleii");//creating java string by new keyword  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3); 

		int i= s1.length();
		System.out.println(i); 

		String s6=	s1.substring(1);//some
		
		String s7=	s1.substring(0,6);
		
		char s9= s1.charAt(5);
		
		System.out.println(s9);//At
		
		

		System.out.println(s6); //output()
		
		System.out.println(s7);





	}

}
