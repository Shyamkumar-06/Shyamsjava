import java.util.Scanner;
class VowelConsonant
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		 char ch = sc.next().charAt(0);
		 switch(ch)
		 {
				case 'a':
				System.out.println("Vowel");
				break;
				case 'e':
				System.out.println("Vowel");
				break;
				case 'i':
				System.out.println("Vowel");
				break;
				case 'o':
				System.out.println("Vowel");
				break;
				case 'u':
				System.out.println("Vowel");
				break;
				default:
				System.out.println("Consonant");
		 }
		 
	}
}










/* 2. Vowel or Consonant 
Ques on: 
Write a program to check whether a given character is a vowel or consonant using switch. 
Input: e 
Output: Vowel  */