package exceptionhandling;

public class maimumandminin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//the maximum elements in an array

		int a[]={20,30,40,50,60};

		int max=a[0];

		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}

		System.out.println("maximum elements in an array"+max);

		int min=a[0];

		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];

			} 

		}
		

		System.out.println("minimum elements in an array"+min);

	}
}
