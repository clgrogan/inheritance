package src.main.model;

import java.util.ArrayList;
import java.util.stream.Collectors;

import src.main.model.account.Account;

public class Bank {
  ArrayList<Account> accounts;
  ArrayList<Transaction> transactions;

  public Bank() {
    accounts = new ArrayList<Account>();
    transactions = new ArrayList<Transaction>();
  }

  /**
   * Name: addAccount
   * 
   * @param account (Account)
   * 
   *                Inside the function:
   *                1. adds an account to the accounts ArrayList
   */
  public void addAccount(Account account) {
    accounts.add(account.clone());
  }

  /**
   * Name: addTransaction
   * 
   * @param transaction
   * 
   *                    Inside the function:
   *                    1. adds a new transaction object to the array list.
   */
  private void addTransaction(Transaction transaction) {
    transactions.add(transaction);
  }

  /**
   * Name: getTransactions
   * 
   * @param accoundId (String)
   * @return (Transaction[])
   * 
   *         1. returns an array of transactions whose id matches the accountId
   */
  public Transaction[] getTransactions(String accountId) {
    return transactions.stream()
        .filter((element -> element.getId().equals(accountId)))
        .collect(Collectors.toList())
        .toArray(Transaction[]::new);
  }

  /**
   * Name: getAccount()
   * 
   * @param transactionId (String)
   * @return (Account)
   * 
   *         1. returns an account whose id matches a transaction.
   */
  public Account getAccount(String id) {
    return accounts.stream()
        .filter(e -> e.getId().equals(id))
        .findFirst().orElse(null);
  }
}
