import java.util.Scanner;
class Month
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter your option");
		int num=sc.nextInt();
		switch(num)
		{
			 case 1:
			 System.out.println("january");
			 break;
			 case 2:
			 System.out.println("february");
			 break;
			 case 3:
			 System.out.println("march");
			 break;
			 case 4:
			 System.out.println("April");
			 break;
			 case 5:
			 System.out.println("May");
			 break;
			 case 6:
			 System.out.println("June");
			 break;
			 case 7:
			 System.out.println("july");
			 break;
             case 8:
			 System.out.println("August");
			 break;
			 case 9:
			 System.out.println("september");
			 break;
			 case 10:
			 System.out.println("october");
			 break;
			 case 11:
			 System.out.println("november");
			 break;
			 case 12:
			 System.out.println("December");
			 break;
			 
			 default:
			 System.out.println("invalid input");
		}
	}
}



/*4. Month Days 
Ques on: 
Write a program that takes a month number (1 to 12) and prints how many days are in that month. 
Use switch. 
Input: 2*/






