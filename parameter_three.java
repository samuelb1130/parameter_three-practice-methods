import java.util.Scanner;

/**
*
*	@ Sam Bauer 22
*	
**/	


public class parameter_three 
{
	
	public static void main(String[] args)
	{
		Scanner bread = new Scanner(System.in);
		
		boolean contRunning = true;
		while(contRunning)
		{
			System.out.println("please enter a number(1/3):");
			int one = bread.nextInt();
				
			System.out.println("please enter a number(2/3):");
			int two = bread.nextInt();
			
			System.out.println("please enter a number(3/3):");
			int three = bread.nextInt();
			bread.nextLine();
			
			
			System.out.println("\nThe smallest value is " + findSmallest(one, two, three));
			
			System.out.println("\nTry again? (y/n):");
			String anwser = bread.nextLine();
			while(!anwser.equals("y") && !anwser.equals("n"))
			{
				System.out.println("\nTry again? (y/n):");
				anwser = bread.nextLine();
			}
				if(anwser.equals("n"))
					contRunning = false;
		}
		
		
	}
	
	public static int findSmallest (int num1, int num2, int num3)
	
	{	
		if (num1<=num2 && num1>=num3)
			return num1;
		else if (num2<=num1 && num2<=3)
			return num2;
		return num3;
	}
	
}
	