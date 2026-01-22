import java.util.Scanner;
class LinearSearch
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinearSearch ob=new LinearSearch();
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int searchvalue=sc.nextInt();
		ob.linear(arr,searchvalue);
	}
	void linear(int arr[],int searchvalue)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(searchvalue==arr[i])
			{
				System.out.println("index value:"+i);
				break;
			}
		}
	}
}