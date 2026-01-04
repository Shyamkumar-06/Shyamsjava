import java.util.Scanner;
class Multiplyloop
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting number :");
		int Snum=sc.nextInt();
		System.out.print("Enter the endting number :");
		int Enum=sc.nextInt();
		int mul=1;
		for(int i=Snum;i<=Enum;i++)
		{
			System.out.println("Eneter the "+i+"st number");
			int num=sc.nextInt();
			mul*=num;
			//System.out.println(num);
			
		}
		System.out.println("protuct of num:"+mul);
	}
}