
public class MainCustomers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank("hell bank");
		bank.addBranch("adelaide");
		
		bank.addCustomer("adelaide", "Joseph", 50.05);
		bank.addCustomer("adelaide", "Jacop", 175.34);
		bank.addCustomer("adelaide", "Isaac", 220.12);
		
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Moses", 150.54);
		
		bank.addCustomerTransaction("adelaide", "Joseph", 44.22);
		bank.addCustomerTransaction("adelaide", "Joseph", 12.44);
		bank.addCustomerTransaction("adelaide", "Jacop", 1.65);
		
		bank.listCustomers("adelaide", true);
		bank.listCustomers("Sydne", true);
	}

}
