import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		if((num>=1))
		{
			boolean c=(num==2);
			if(c== true){
				System.out.println("prime number");
			}
			
			
		}
		else if((num>=1)&&(num%2!=0)&&(num%1==0)&&(num%num==0))
		{
			System.out.println("prime not number");	
		}
		else{
			System.out.println("not valid");
			
		}
	}
}/* Error I dont know*/