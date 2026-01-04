class Pattern13
{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			int x=i;
			for(int j=1;j<=n;j++)
			{
				System.out.printf(" %2d",x);
				x+=5;
			}
			System.out.println("");
		}
		
	}
}