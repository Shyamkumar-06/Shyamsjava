import java.util.Scanner;
class StudentM
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the no of student");
		int num=sc.nextInt();
		String name[]=new String[num];
		int mark[]=new int[num];
		int choice;
		do
		{
			System.out.println("!.add the student");
		    System.out.println("2.display all student");
		    System.out.println("3.find the highest score");
		    System.out.println("4.Exit");
		    System.out.print("Enter the your option: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				for(int i=0;i<name.length;i++)
				{
					System.out.println("Enter name "+i+" st student name:");
					name[i]=sc1.nextLine();
					System.out.println("Enter mark "+i+" st student :");
					mark[i]=sc.nextInt();	
				}
				break;
				case 2:
				for(int i=0;i<name.length;i++)
				{
					System.out.println(name[i] + mark[i]);
				}
				break;
				case 3:
				int max=0;
				int j=0;
				for(int i=0;i<name.length;i++)
				{
					if(max>mark[i])
					{
						max=mark[i];
						j++;
					}
				}
				System.out.println(max+name[j]);
				break;
				case 4:
				break;
				default:
				System.out.println("Enter valid choice");
				break;
			}
		}while(choice!=4);
	
	}
	
	

}



/*Write a Java program to create a menu-driven student grade management system using arrays.
The program should allow the user to:
- Add Students: Store student names in a String array and their marks in an int array.
- Display All Students: Show all student names along with their marks.
- Find Highest Scorer: Display the student with the highest marks.
- Exit the Program
*/