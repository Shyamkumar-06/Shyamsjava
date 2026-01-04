class Pattern8
{
	public static void main(String[] args)
	{
		int n=1;
		int a=1;
		for(int i=5;n<=i;i--)
		{
			for(int j=10;n<=j;j--)
			{
				if(a%2!=0){
				System.out.printf(" %2d",a);
				}
				a++;
			}
			System.out.println(" ");
		}
	}
}