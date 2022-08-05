package accessModifiers;

import java.util.ArrayList;

public class Account {

	private String accountName;
	private int balance;
	private ArrayList<Integer> transactions;
	
	
	public Account(String accountName) {
		this.accountName = accountName;
		this.transactions = new ArrayList<Integer>();
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void deposit(int amount){
		if(amount > 0){
			transactions.add(amount);
			this.balance += amount;
			System.out.println(amount +" deposited. Balance is now : "+ this.balance);
		}else
			System.out.println("Cannot deposit negative sums");
	}
	
	public void withDraw(int amount){
		int withDrawal = -amount;
		if(withDrawal < 0){
			transactions.add(withDrawal);
			this.balance += withDrawal;
			System.out.println(amount +" withdrawn. Balance is now : "+ this.balance);
		}else
			System.out.println("Cannot withdraw negative sums");
	}
	
	public void calculateBalance(){
		this.balance = 0;
		for(int i: this.transactions)
			this.balance += i;
		System.out.println("Calculated balance is "+ this.balance);
	}
}
