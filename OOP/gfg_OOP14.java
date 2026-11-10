//geeksforgeeks OOP exercise (14/25) Program to deposit and withdraw from a bank account and also display account details
class BankAccount
{ int acctNo;
  double balance;
  String acctType;
  BankAccount(int acctNo, double balance, String acctType)
  { this.acctNo= acctNo;
    this.balance= balance;
	this.acctType= acctType;}
	
	void withdraw(double amount)
	{ if ( balance<amount)
	  System.out.println("Insufficient funds");
	  else
	  balance=balance-amount;
	  }
	  void deposit(double amount)
	  { balance= balance+amount;}
	  void display()
	  { System.out.println("Account number: "+acctNo);
	    System.out.println("Account Type: "+acctType);
		System.out.println("Balance: "+balance);
		}
		public static void main( String args[])
		{ BankAccount ba= new BankAccount(123456,50000.00,"Savings");
		  ba.deposit(10000);
		  ba.withdraw(5000);
		  ba.display();
		  }
		  }
	  