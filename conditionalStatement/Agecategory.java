import java.util.Scanner;
class Agecategory
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter age:");
		age=sc.nextInt();
		if(age>0&&age<=12)
		{
			System.out.println("Child");
		}
		else if(age>=13&&age<=19)
		{
			System.out.println("Teenager");
		}
		else if(age>=20&&age<=59)
		{
			System.out.println("Adult");
		}
		else if(age>=60&& age<=122)
		{
			System.out.println("Senior");
		}
		else
		{
			System.out.println("invalid age");
		}
		
		
		
		
		
	}
}