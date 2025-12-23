class Palindrome
{
	public static void main(String[] args)
	{
		int a=151;//153
		int b=a%10;//3
		int c=a/10;//15
		int e=c%10;//5
		int f=c/10;//1
		int g=(f*100)+(e*10)+(b*1);
		boolean h=(g==a);//151--->151 reverse numberequal to original number
		System.out.println("is palindrome"+h);
	}
}