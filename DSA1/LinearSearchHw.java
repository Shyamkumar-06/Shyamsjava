import java.util.Scanner;
class LinearSearchHw
{
	public static void main(String[] args)
	{
	LinearSearchHw obj=new LinearSearchHw();
	Scanner sc=new Scanner(System.in);
	int arr[]={44,55,66,77,88,99,3,22,44,56,77,55};
	System.out.println("Enter the the element to be search");
	int search=sc.nextInt();
	int result=obj.linear(arr,search);
	System.out.println(result);
	
	
	}
	int linear(int arr[],int search)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				return i;
			}
			
		}
		return -1;
	}
	
}