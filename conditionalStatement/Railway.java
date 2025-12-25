import java.util.Scanner;
class Railway
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter your option");
		 int num=sc.nextInt();
		  switch(num)
		  {
			 case 1: 
			 System.out.println("General ");
			 break;
			 case 2:
			 System.out.println("Sleeper");
			 break;
			 case 3:
			 System.out.println("AC 3 Tier");
			 break;
			 case 4:
			 System.out.println("AC 2 Tier");
			 break;
			 case 5:
			 System.out.println("First Class ");
			 break;
			 
			 default:
			 System.out.println("invalid input");
		  }
	}
}









/*  6. Railway Ticket Class 
Ques on: 
Input seat type: 
 1 → General 
 2 → Sleeper 
 3 → AC 3 Tier 
 4 → AC 2 Tier 
 5 → First Class 
Use switch to display the class name and cket rate.i */