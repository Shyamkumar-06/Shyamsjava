import java.util.Scanner;
class TraficLight
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a traffic light colour");
		String input = sc.nextLine();
		switch(input)
		{
			case "red":
			 System.out.println("Stop");
			 break;
			 case "yellow":
			 System.out.println("Wait");
			 break;
			 case "green":
			 System.out.println("Go**");
			 break;
			 default:
			 System.out.println("invalid light");
		}
		
	}
}







/* Traffic Light 
Ques on: 
Write a program that takes a colour as a string (Red, Yellow, Green) and displays the traffic signal 
meaning. 
Input: Red 
Output: Stop    */