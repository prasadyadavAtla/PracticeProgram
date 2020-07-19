package exceptionhandling;

public class CountNumberDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int num=134;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("the total number of digit"+count);

	}

}
