import java.util.Scanner;
class StudentResult
{
	 static int mark1,mark2,mark3;
	 static double total;
	
	public static void main(String[] args)
	{
	      Scanner sc=new Scanner(System.in);
		  int choice=0;
		  System.out.println(". Display Total\n2. Display Percentage\n3. Display Result\n4. Display Grade\n5.Exi");
		  System.out.println("Enter your choice:");
		  choice=sc.nextInt();
		  switch(choice)
		  {
			  case 1:
			  inputmark();
			  calculateTotal();
			   break;
			  case 2:
			  inputmark();
			  calculateTotal();
			  percentage();
			  break;
			  case 3:
			  inputmark();
			  result();
			  break;
			  case 4:
			  inputmark();
			  grade();
			  break;
			  case 5:
			  break;
		  }
	
		
	}
	
	public static void inputmark()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 subject mark");
		mark1=sc.nextInt();
		mark2=sc.nextInt();
		mark3=sc.nextInt();
	}
	public static void calculateTotal()
	{
			total=mark1+mark2+mark3;
			System.out.println("Total mark="+total);
	}
	public static void percentage()
	{
		double percen=(total/300)*100;
		System.out.println("Percentage="+percen);
	}
	public static void result()
	{
		double percen=(total/300)*100;
		if(percen>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	public static void grade()
	{
		double percen=(total/300)*100;
		if(percen>=90&& percen<=100)
		{
			System.out.println("o");
		}			
		else if(percen>=75&& percen<90)
		{
			System.out.println("A");
		}
		else if(percen>=45&& percen<75)
		{
			System.out.println("A");
		}
		else
		{
				System.out.println("F");
		}
		
		
	}
}
