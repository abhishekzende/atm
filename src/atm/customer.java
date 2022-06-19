package atm;

import java.util.Scanner;

class bank
{
	private double bal=50000;
	private int pwd=123;
	
	public void deposit(double money) 
	{
		System.out.println("ENTER THE PASSWORD");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123) 
		{
			System.out.println("ENTER THE AMOUNT");
			Scanner s2=new Scanner(System.in);
			money=s2.nextDouble();
			
			bal=bal+money;
			
			System.out.println("deposit="+money);
			System.out.println("total balance="+bal);
	
		}
		else {
			System.out.print("invalid password");
		
		}
		
		
			
		}
		
	public void withdraw(double money) 
	{
		System.out.println("ENTER THE PASSWORD");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123) 
		{
			System.out.println("ENTER THE AMOUNT");
			Scanner s2=new Scanner(System.in);
			money=s2.nextDouble();
			
			bal=bal-money;
			
			System.out.println("withdraw ="+money);
			System.out.println("total balance="+bal);
	
		}
		else {
			System.out.print("invalid password");
		
		}
		
		
		
		
	}
	
	public void checkbal() 
	{
		System.out.println("ENTER THE PASSWORD");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123) 
		{
		  System.out.println("balance="+bal);
	
		}
		else {
			System.out.print("invalid password");
		
		}
		
		
		
	}
	
}











public class customer {

	public static void main(String[] args)
	{
		bank b=new bank();
		
		System.out.println("1.deposite");
		System.out.println("2.withdraw");
		System.out.println("3.checkbalance");
		
		int ch;
		
		System.out.println("ENTER YOUR CHOICE");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		
		switch(ch)
		{
		case 1: b.deposit(ch);
		break;
		
		case 2: b.withdraw(ch);
		break;
		
		case 3: b.checkbal();
		break;
		
		default :System.out.println("CHOICE IS INVALID");
		}

	}

}
