import java.util.Scanner;
class BinaryRecurtion
{
	public static void main(String args[])
	{
		BinaryRecurtion ob=new BinaryRecurtion();
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
		int left=0,rigth=arr.length-1,mod=(left+rigth)/2;
		int result=ob.binary(arr,left,rigth,mod,searchValue);
		System.out.println(result);
	}
	int binary(int arr[],int left,int rigth,int mod,int searchValue)
	{
		if(left<=rigth)
		{
			if(arr[mod]==searchValue)
			{
				return mod;
			}
			else if(searchValue<arr[mod])
			{
				rigth=mod-1;
			}
			else if(searchValue>arr[mod])
			{
				left=mod+1;
			}
			mod=(left+rigth)/2;
			return binary(arr,left,rigth,mod,searchValue);
			
		}return -1;
	}
}