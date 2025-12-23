class Amstrong3
{
	public static void main(String[] args)
	{
		int a=153;
		int b=a%10;//3
		int c=a/10;//15
		int d=c%10;//5
		int e=c/10;//1
		int f=(b*b*b)+(d*d*d)+(e*e*e);
		boolean g=(a==f);
		System.out.print("if true it is amstrong number if false it is not a amstrong number---"+g);
	}
}