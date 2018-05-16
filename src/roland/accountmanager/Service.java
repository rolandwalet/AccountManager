package roland.accountmanager;

import java.util.HashMap;

public class Service {
	private HashMap<Integer, Account> accounts = new HashMap<>();
	
	public void addAccount(String firstName, String lastName, int accountNumber) {
		Account account = new Account(firstName, lastName, accountNumber);
		accounts.put(accountNumber, account);
	}
	
	public Account getAccount(int key) {
		return accounts.get(key);
	}
	
	public void setAccountFirstName(int key, String firstName) {
		getAccount(key).setFirstName(firstName);
	}
	public void setAccountLastName(int key, String lastName) {
		getAccount(key).setFirstName(lastName);
	}
	
}