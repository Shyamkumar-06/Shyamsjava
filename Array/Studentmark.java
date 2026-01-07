import java.util.Scanner;
class Studentmark
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of student::");
		int stu=sc.nextInt();
		System.out.println("enter number of subject::");
		int sub=sc.nextInt();
		int arr[][]=new int[stu][sub];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Eter "+"stu"+i+" subject  "+j);
		    	arr[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println(" ");
		}
		
		
	}
}