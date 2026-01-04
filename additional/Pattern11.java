class Pattern11
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.printf("%2d%2d",j,i);
			}
			System.out.println("  ");
		}
	}
}