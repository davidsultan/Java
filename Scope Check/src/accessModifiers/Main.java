package accessModifiers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account("Malcolm");
		a.deposit(1000);
		a.withDraw(500);
		a.withDraw(-200);
		a.deposit(-20);
		a.calculateBalance();
		
		System.out.println("The balance is : "+ a.getBalance());
	}

}
