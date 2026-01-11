import java.util.Scanner;
class NumberAr
{
	
	Scanner sc=new Scanner(System.in);
	int length;
	int num[];
	
	public static void main(String[] args)
	{
		NumberAr op=new NumberAr();
		op.mainmenu();
	}
	void mainmenu()
	{
		System.out.print("ENTER THE LENGTH OF ARRAY");
		int length=sc.nextInt();
		num=new int[length];
		int choice;
		do
		{
			
			System.out.println("Enter your choice");
			System.out.println("1.Enter Number");
			System.out.println("2.Display Number");
			System.out.println("3.Count Positive number");
			System.out.println("4.Count Negative Number");
			System.out.println("5.Count Zeros");
			System.out.println("6.Exit");
			System.out.print("Enter your option:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				arrayvalue();
				break;
				case 2:
				displayarray();
				break;
				case 3:
				positivenumber();
				break;
				case 4:
				negativenumber();
				break;
				case 5:
				zero();
				break;
				case 6:
				break;
				default :
				System.out.println("Invalid option:");
				break;
			
			}
		}while(choice!=6);
		
	
		
		
	}
	void arrayvalue()
	{
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
	}
	void displayarray()
	{for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+ " ");
		}
		
	}
	void positivenumber()
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>0){
			System.out.print(num[i]+ " ");
			}
		}
		
	}
	void negativenumber()
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0){
			System.out.print(num[i]+ " ");
			}
		}
		
	}
	void zero()
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==0){
			System.out.print(num[i]+ " ");
			}
		}
		
	}
}