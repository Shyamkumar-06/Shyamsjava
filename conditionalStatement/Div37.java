import java.util.Scanner;
class Div37
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1;
		System.out.println("Enter the number");
		num1=sc.nextInt();
		if ((num1%3==0)&&(num1%7==0))
		{
			System.out.println("The number is divided by both 7 and 3");
		}
		
		else if (num1%3==0)
		{
			System.out.println("The number is divided  3");
		}
		else if (num1%7==0)
		{
			System.out.println("The number is divided  7");
		}
		else
		{
				System.out.println("The number is  not divided by both 7 and 3");
		}
		
	}
}