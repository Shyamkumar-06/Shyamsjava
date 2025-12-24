class Exam
{
	public static void main(String[] args)
	{
		int mark=66;
		if((mark>=90)&&(mark<=100))
		{
			System.out.println("A grade");
		}
		else if((mark>=70)&&(mark<=90))
		{
			System.out.println("B grade");
		}
		else if((mark>=50)&&(mark<=70))
		{
			System.out.println("C grade");
		}
		else if((mark>=25)&&(mark<=50))
		{
			System.out.println("D grade");
		}
		else if((mark>=0)&&(mark<=25))
		{
			System.out.println("U grade");
		}
		else
		{
			System.out.println("invalid grade");
		}
		
	}
}