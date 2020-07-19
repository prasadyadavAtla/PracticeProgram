package exceptionhandling;

import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		
		int randomInteger=r.nextInt(100);
		
		System.out.println("random"+randomInteger);
	}

}
