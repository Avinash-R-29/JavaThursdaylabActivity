package Lab_Activity05_Author;

public class BankDetails {
	private Bank[] account;
	private int entry;
	
	BankDetails()
	{
		account=new Bank[4];
				
	}
public void checkBalance(Bank input)
{
	if(entry<account.length) 
	{
		account[entry]=input; 
		entry++; 
		
		if(input.getBalance()<(1000))
		System.out.println("Low Balance Account Details are :"+  input.getName() + ", Rs." + input.getBalance()); 
	}
}
	public static void main(String[] args) {
		
		Bank b1 = new Bank("Avinasha",00111,1001.00);
		Bank b2 = new Bank("Jagadeesh",00222,999.75);
		Bank b3 = new Bank("Manju",00333,1000.96);
		Bank b4 = new Bank("Gnana",00444,998.51);
		
		BankDetails myBank = new BankDetails();
		myBank.checkBalance(b1);
		myBank.checkBalance(b2);
		myBank.checkBalance(b3);
		myBank.checkBalance(b4);
	}

}
