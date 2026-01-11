import java.util.Scanner;
class Reversenumber
{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int length;
	public static void main(String[] args)
	{
		Reversenumber num=new Reversenumber();
		num.menu();
	
	}
	void menu()
	{
		System.out.println("Enter the length of array:");
		length=sc.nextInt();
		arr=new int[length];
		
		
		
		int choice;
		do
		{
			System.out.println("1.enter number in array");
			System.out.println("2.display number in array");
			System.out.println("3.Display number in reverse order");
			System.out.println("4.Exit");
			System.out.println("Enter your option:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				inputnumber();
				break;
				case 2:
				Display();
				break;
				case 3:
				ReverseDisplay();
				break;
				case 4:
				break;
			}
		}while(choice!=4);
	}
	void inputnumber()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the"+(i+1) +"St number");
			arr[i]=sc.nextInt();
			
		}
	}
	void Display()
	{    
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
			
		}
	}
	void ReverseDisplay()
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
				
		}
	}
}