import java.util.Scanner;
class AmstrongNumber
{
	public static void main(String[] args)
	{
		int num,temp,sum=0,ld=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		while(temp>0)
		{
			ld=temp%10;
			sum+=ld*ld*ld;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("it is a amstrong number");
		}
		else
		{
			System.out.println("it is not a amstrong number");
		}
		
	}
}