import java.util.Scanner;
class Favplace
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the number of row::");
		int row=sc.nextInt();
		System.out.print("Enter the column  ::");
		int column=sc.nextInt();
		String arr[][]=new String[row][column];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter "+i +" ," +j+ "intex:");
				arr[i][j]=sc1.nextLine();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf(" %10s " ,arr[i][j]);
				
			}
			System.out.println("  ");				
		}
		
	}
}