import java.util.Scanner;
class BMS
{
	Scanner sc=new Scanner(System.in);
	double bankbalance=0.0;
	public static void main(String[] args)
	{
	 menu();
		
	}
	void menu()
	{
		int choice;
		do{
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. CheckBalace");
		System.out.println("4. Exit");
		System.out.println("Enter your option:");
		 choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			deposite();
			break;
			case 2:
			withdraw();
			break;
			case 3:
			checkbalance();
			break;
			case 4:
			break;
			default :
			System.out.println("Enter correct option");
			
			
		}
		
		}while(choice!=4);
		
	
	}
	void deposite()
		{
			
			System.out.println("Enter your to deposite:");
			double depositeam =sc.nextDouble();
			bankbalance+=depositeam;
			
		}
		void withdraw()
		{
		   double withdrawam=sc.nextDouble();
		   if(bankbalance==withdrawam || bankbalance>=withdrawam)
		   {
		   bankbalance-=withdrawam;
		   }
		   else
		   {
			   System.out.println("insafficent bankbalance");
		   }
		   
		}
		void checkbalance()
		{
			System.out.println("Your BANK BALANCE:"+bankbalance);
		}
}