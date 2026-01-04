import java.util.Scanner;
class SpecialNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,sum=0,mul=1,temp,ld;
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		while(temp>0)
		{
			ld=temp%10;
			mul*=ld;
			sum+=ld;
			temp=temp/10;
		}
		int result=sum+mul;
		if(result==num)
		{
			System.out.println("this Special number");
		}
		else
		{
			System.out.println("this  not Special number");
		}
	}	
}