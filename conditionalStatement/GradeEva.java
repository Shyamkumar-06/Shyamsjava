import java.util.Scanner;
class GradeEva
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your grade :");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			
			case 'a':
			System.out.println("exacalet");
			break;
			case 'b':
			System.out.println("ver good");
			break;
			case 'c':
			System.out.println("Good");
			break;
			case 'd':
			System.out.println("moderate");
			break;
			case 'e':
			System.out.println("pass");
			break;
			case 'f':
			System.out.println("Fail");
			break;
			default:
			System.out.println("invalid");
		}
	}
}


/* 3. Grade Evalua on 
Ques on: 
Accept a character input for grade (A, B, C, D, F) and display the performance message using switch. 
Input: B 
Output: Good */