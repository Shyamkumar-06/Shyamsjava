import java.util.Scanner;
class AnujGarment
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Anuj Dreams");
		System.out.println("1. Kids Section");
		System.out.println("2. Womens Section");
		System.out.println("3. Mens Section");
		System.out.print("Choose your section : ");
		
		int choice = sc.nextInt();
		
		if(choice==1)
		{	
			System.out.println("Welcome to Kids Section");
			System.out.println("1. Vesti shirt");
			System.out.println("2. Coat suit");
			System.out.println("3. Frock");
			System.out.print("Select your option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{	
				System.out.println("Vesti Shirt - Rs. 600");
			}
			else if(option==2)
			{
				System.out.println("Coat suit - Rs. 999");
			}
			else if(option==3)
			{
				System.out.println("Frock - Rs. 1400");
			}
			else
			{
				System.out.println(" Your choice is not avilable");
			}
			
		}
		
		else if(choice==2)
		{	
			System.out.println("Welcome to Womens Section");
			System.out.println("1. Saree");
			System.out.println("2. Chudithar");
			System.out.println("3. Western");
			System.out.print("Select your option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{	
				System.out.println("Saree - Rs. 2000");
			}
			else if(option==2)
			{
				System.out.println("Chudithar - Rs. 1200");
			}
			else if(option==3)
			{
				System.out.println("Western - Rs. 999");
			}
			else
			{
				System.out.println(" Your choice is not avilable");
			}
			
		}
		
		else if(choice==3)
		{	
			System.out.println("Welcome to Mens Section");
			System.out.println("1. Shirt");
			System.out.println("2. Pant");
			System.out.println("3. T-Shirt");
			System.out.print("Select your option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{	
				System.out.println("Shirt - Rs. 400");
			}
			else if(option==2)
			{
				System.out.println("Pant - Rs. 999");
			}
			else if(option==3)
			{
				System.out.println("T-Shirt - Rs. 199");
			}
			else
			{
				System.out.println(" Your choice is not avilable");
			}
			
		}
		
		
		
		else
		{
			System.out.println(" Thank you for visit");
		}
		
		
		
	}
}