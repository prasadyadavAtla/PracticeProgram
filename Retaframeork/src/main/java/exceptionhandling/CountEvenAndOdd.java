package exceptionhandling;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1346;
		int odd=0;
		int even=0;

		while(num>0)
		{
			int reminder=num%10;

			if(reminder%2==0)
			{
				even++;
			}

			else
			{
				odd++;
			}
			
			num=num/10;
		}
		System.out.println("even count"+even);	

		System.out.println("odd count"+odd);
	}

}
