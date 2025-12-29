import java.util.Scanner;
class Ebill
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int unit;
		int bill;
		System.out.println("Enter  hoe many units of electricity");
		unit=sc.nextInt();
		if((unit>=1)&&(unit<=100))
		{
			bill=unit*5;
			System.out.println("Electric bill="+ bill);
		}
		else if((unit>=101)&&(unit<=200))
		{
			bill=unit*7;
			System.out.println("Electric bill="+ bill);
		}
		else if(unit<200)
		{
			bill=unit*10;
			System.out.println("Electric bill="+ bill);
		}
		else
		{
			System.out.println("not pay a bill");
			
		}
	}
}
