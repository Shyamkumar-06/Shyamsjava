import java.util.Scanner;
class Dletion
{
	Scanner sc=new Scanner(System.in);
	//int index;
	public static void main(String[] args)
	{
		Dletion obj=new Dletion();
		int arr[]={30,40,50,60,70};
		int newarr[]=new int[arr.length-1];
		obj.del(arr,newarr);
		
	}
	void del(int arr[],int newarr[])
	{
		System.out.println("Enter the element you want delete in the array");
		int delElement=sc.nextInt();
		int index=0;
	
		for(int i=0 ;i<arr.length;i++)
		{
			if(arr[i]==delElement)
			{
				index=i;
				break;
			}
		}
		for(int i=0;i<index;i++)
		{
			newarr[i]=arr[i];
			
		}
		for(int i=index;i<newarr.length;i++)
		{
			newarr[i]=arr[i+1];
		}
		prin(newarr,index);
		
	}	
		void prin(int newarr[],int index)
		{
			for(int i=0;i<newarr.length;i++)
			{
				System.out.print("  "+newarr[i]+"  ");
			}
			System.out.println(index);
			
			
		}
		
	
}