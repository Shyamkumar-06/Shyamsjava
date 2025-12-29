import java.util.Scanner;
class Leapyear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		short year;
		System.out.println("enter the year:");
		year=sc.nextShort();
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			System.out.println(" the year:"+year +"is"+"leapyear");
		}
		else
		{
			System.out.println("the year:"+year +"is not"+"leapyear");
		}
		
	}
}