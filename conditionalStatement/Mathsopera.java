import java.util.Scanner;
class Mathsopera
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two number:");//input
		num1=sc.nextInt();//2
		num2=sc.nextInt();//3
		System.out.println("enter the operaation:");
		System.out.println("add---sub---mul---div--moddiv");
		String str=sc.next();
		switch(str)
		{
			case "add":
			System.out.println("num1+num2"+(num1+num2));
			break;
			case "sub":
			System.out.println("num1-num2"+ (num1-num2));
			break;
			case "mul":
			System.out.println("num1*num2"+(num1*num2));
			break;
			case "div":
			float c=(float)num1/num2;
			System.out.println("num1/num2" +c);
			
			break;
			case "moddiv":
			float d=(float)num1%num2;
			System.out.println("num1+num2" +d);
			break;
			default:
			System.out.println("invalid operation");
			break;
			
		}
		
		
		
			
		
	}
}