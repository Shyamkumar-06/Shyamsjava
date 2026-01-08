import java.util.Scanner;
class Empname
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Eneter no of employee:");
		int len=sc.nextInt();
		String emp_name[]=new String[len];
		int index=0;
		int choice=0;
		do
		{
			System.out.print("1.Add employee\n2.Display list of employee\n3.exit");
			System.out.println("enter the choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
				if(index<len)
				{
				System.out.print("Enter the name of employee::");
				emp_name[index]=sc1.nextLine();
				index++;
				}
				else
				{
					System.out.println("Empoyee list is fill");
				}
				break;
				case 2:
				for(int i=0;i<index;i++)
				{
					System.out.println(emp_name[i]+" ");
				}
				break;
				case 3:
				break;
				default:
				System.out.println("Enter valid choice");
			}
		}while(choice!=3);
	
	}
}
	
	

	

