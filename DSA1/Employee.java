import java.util.Scanner;
class Employee
{
	int choice;
	Scanner sc=new Scanner(System.in);
	int len;
	int arr[];
	int index=0;
	int remove;
	int newemp[];
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		System.out.println("Enter the length of array:");
		emp.length=sc.nextInt();
		arr=new int[length];
		newemp=new int[len-1];
		Employee emp=new Employee();
		emp.menu();
	
		
	}
	void menu()
	{
		do
		{
			System.out.println("************MAIN MENU***************");
			System.out.println("1.Add Employee");
			System.out.println("2.Remove Employee");
			System.out.println("3.Display Employee");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			addEmp();
			 print(newemp);
			break;
			case 2:
			removeEmp();
			 print(newemp);
			break;
			case 3:
			  display();
			  print(newemp);
			break;
			case 4:
			break;
			default:
			System.out.println("Enter valid choice");
			}	
		}while(choice!=4) ;
		
		
		
	}
	void addEmp()
	{
		arr[index]=sc.nextInt();
		for(int i=index;i<index+1;i++)
		{
			newemp[i]=arr[i];
		}
		index++	;	
		
	}
	void removeEmp()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(remove==arr[i])
			{
				for(int j=i;j<arr.length;j++)
				{
					newemp[i-1]=arr[i];
				}
			}
		}
		
	}
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			newemp[i-1]=arr[i];
		}
		
	}
	void print(int arr1[])
	{
		for(int i=0;i<index;i++)
		{
			System.out.println(arr1[i]+" ");
		}
	}

}