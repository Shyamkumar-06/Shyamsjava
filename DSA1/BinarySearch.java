import java .util.Scanner;
class BinarySearch
{
	public static void main(String[] args)
	{
		BinarySearch obj=new BinarySearch();
		int r=obj.array();
		System.out.println("index poosition is"+r);
		
	}
	int array()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int left=0;
		int right=arr.length-1;
		int mod =(left+right)/2;
		System.out.println("Enter the search element:");
		int search=sc.nextInt();
		int result=binarysearch(arr, left,right, mod,search);
		return result;
		
	}
	int binarysearch(int arr[],int left,int right,int mod,int search)
	{
		while(left<=right)
		{
			if(search==arr[mod])
			{
				return mod;
			}
			else if(search<right)
			{
				left=mod+1;
			}
			else if(search>right)
			{
				right=mod-1;
			}
			mod=(right+left)/2;
		}
		return -1;
	}
	
}