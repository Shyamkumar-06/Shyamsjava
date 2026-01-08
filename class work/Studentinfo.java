import java.util.Scanner;
class Studentinfo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the no of student:");
		int len=sc.nextInt();
		String name[]=new String[len];
		int index=0;
		int choice=0;
		
		do
		{
				System.out.println("1.add student \n 2.display \n3.exit;");
				System.out.println("Enter your choice;");
				choice=sc.nextInt();
				
			switch(choice)
			{  
				case 1:
				System.out.print("Enter the Student name:");
				name[index]=sc1.nextLine();
				index++;
				break;   
				case 2: 
				 for(int i=1;i<index;i++)
				 {
					System.out.print(name[i]);
				 }
				
				break;
				case 3:
				
				break;
	
			}
		}while(choice!=3);
		
	}
}