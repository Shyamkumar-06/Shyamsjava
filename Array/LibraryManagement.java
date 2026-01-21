import java.util.Scanner;
class LibraryManagement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter no of book in library:");
		int len=sc.nextInt();
		int B_id[]=new int[len];
		String B_name=new String[len];
		//int BI_index=0;
		int BN_index=0;
		int choice=0;
		int id;
		String name;
		do
		{
			System.out.println("1.Add Book\n2.SearchBook\n3.Display All Book\n3.Exit");
			System.out.print("Eter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter Book id");
				B_id[BN_index]=Sc.nextInt();
				System.out.println("Enter the Book name:");
				B_name[BN_index]=sc1.nextLine();
				//BI_index++;
				BN_index++;
				break;
				case 2:
				System.out.println("Enter the book id");
				id=sc.nextInt();
				for(int i=0;i<BN_index;i++)
				{
					if(id==B_id[i])
					{
					System.out.print(B_name[i]+" ");
					}
					else
					{
						System.out.print("Book is not found");
					}
				}
				break;
				case 3:
				System.out.println("****THE BOOK IN OUT LIBRARY************");
				for(int i=0;i<BN_index;i++)
				{
					System.out.println("book id:"+B_id[i]+"book name"+i+ B_name[i]);
				}
				break;
				case 4:
				System.out.println("*********Thankyou vist out library***");
				break;
				default:
				System.out.println("Invalid choice plese enter correct choice");
				break;
				
				
				
				
			}
		}while(choice!=4);
	}
} 