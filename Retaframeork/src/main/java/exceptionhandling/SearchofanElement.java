package exceptionhandling;

public class SearchofanElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={10,55,66,22};
		
		int ele=66;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i])
			{
				System.out.println("the element present"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("the element not present");
		}
		

	}

}
