package tp1.services;

import java.util.HashMap;
import java.util.Map;

import tp1.business.Account;

public class AccountManager {
	private static Map<Long, Account> accounts = new HashMap<>();
	public long createAccount(Long id, String accountNumber, double balance) {
		return id;
		//TODO
	}
	public Account getAccountById(Long id) {
		return null;
		//TODO
	}
	public void depositMoney(Long id, double amount) {
		//TODO
	}

}
