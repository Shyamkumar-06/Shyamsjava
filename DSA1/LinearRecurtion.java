import java.util.Scanner;
class LinearRecurtion
{
	public static void main(String[] args)
	{
		LinearRecurtion ob=new LinearRecurtion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter the array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter value is searched");
		int searchValue=sc.nextInt();
		int index=0;
		int result= ob.linear(index,arr,searchValue );
		System.out.println(result);
	}
	int linear(int index,int arr[],int searchValue )
	{
		if(index<arr.length)
		{
			if(arr[index]==searchValue)
			{
				return index;
			}
			
			return  linear(++index,arr,searchValue );
		}
		
		
		return -1;
	}
}