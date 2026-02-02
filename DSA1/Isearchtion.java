import java.util.Scanner;
class Isearchtion
{
	public static void main(String[] args)
	{
		Isearchtion obj=new Isearchtion();
		obj.array();
		
	}
	void array()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the array element");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] newarr=new int[len+1];
		System.out.println("inter the index you to be added");
		int index=sc.nextInt();
		System.out.println("Enter the Element you to be added");
		int element=sc.nextInt();
		preinsearchtion(index,arr,newarr,element);
		
		
	}
	 void preinsearchtion(int index,int arr[],int newarr[],int element)
	{
		for(int i=0;i<index;i++)
		{
			newarr[i]=arr[i];
		}
		newarr[index]=element;
		for(int i=index;i<arr.length;i++)
		{
		    newarr[i+1]=arr[i];
		}
		printArr(newarr);
	}
	void printArr(int newarr[])
	{
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]+" ");
		}
	}	
}