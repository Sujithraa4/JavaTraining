package com.assoops;

/**
 * Accessing all the methods
 * @author ssampath
 * Date 27/04/2023
 */

class Account{
	private String id;
	private String name;
	private int balance=0;
	
	public Account(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public Account(String id,String name,int balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getId() {
		return(id);
	}
	public String getName() {
		return(name);
	}
	public int getBalance() {
		return(balance);
	}
	public int credit(int amount) {
		balance=balance+amount;
		return(balance);
	}
	public int debit(int amount) {
		if(amount<=balance)
			balance-=amount;
		else
			System.out.println("Amount exceeds balance");
		return(balance);
	}
	
}
public class AccountDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
