import java.util.Scanner;
class MenuRl
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.print("enetr the no of users:");
		int len=sc.nextInt();
		String user_name[]=new String[len];
		String password[]=new String[len];
		int u_index=0;
		int n_index=0;
		int choice=0;
		String c_name;
		String p_name;
		boolean b=false,c=false;
		
		do
		{
			System.out.println("1.Registration\n 2.login 3.\n exit");
			System.out.print("Enter the your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.print("Welcome to out site***");
				System.out.println("Enter you user name");
				user_name[u_index]=sc1.nextLine();
				System.out.print("Enter the password:");
				password[n_index]=sc1.nextLine();
				u_index++;
				n_index++;
				break;
				case 2:
				System.out.println("Enter your username:");
				c_name=sc1.nextLine();
				System.out.println("Enter your password:");
				p_name=sc1.nextLine();
				for(int i=0;i<u_index;i++)
				{
					if(c_name.equals(user_name[i]))
					{
						if(p_name.equals(password[i]))
						{
							System.out.println("login susscessfully");
						}
						
					}
					else
					{
					System.out.println("check user name or password");
					}
				}
				break;
				case 3:
				System.out.println("Thank you for visit our sight");
				break;
				default:
				System.out.println("your choice is wrong plese enter the valid choice");
				
			}
			
		}while(choice!=3);
	}
}