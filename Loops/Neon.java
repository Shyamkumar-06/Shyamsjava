import java.util.Scanner;
class Neon
{
	public static void main(String[] args)
	{
		int num,mul=1,sum=0,ld;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		mul=num*num;
		while(mul>0)
		{
			ld=mul%10;
			sum+=ld;
			mul=mul/10;
		}
		if(sum==num)
		{
			System.out.println("it is a Neon number");
		}
		else
		{
			System.out.println("it is not a Neon number");
		}
		
	}
}