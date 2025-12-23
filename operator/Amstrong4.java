class Amstrong4
{
	public static void main(String[] args)
	{
		int a=1634;
		int b=a%10;//4
		int c=a/10;//163
		int d=c%10;//3
		int e=c/10;//16
		int f=e%10;//6
		int g=e/10;//1
		int h=(b*b*b*b)+(d*d*d*d)+(f*f*f*f)+(g*g*g*g);
		boolean i=(a==h);
		System.out.println("if true it is amstrong number if false it is not a amstrong==="+i);
	}
}
