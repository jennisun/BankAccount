public class BankAccount {

  private double balance;
  private int accountID;
  private String password;


  public double getBalance () {
    return balance;
  }

  public double getAccountID () {
    return accountID;
  }

  public BankAccount(  int accountID, String password){
    this.accountID = accountID;
    this.password = password;
  }

  public void setPassword(String password){
    this.password = password;
  }


  public boolean deposit(double amount){
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    else return false;
  }


  public boolean withdraw(double amount){
    if (amount >= 0 && amount <= balance) {
      balance = balance - amount;
      return true;
    }
    else return false;
  }

  public String toString() {
    return "#" + accountID + "\t" + "$"+ balance;
  }


  private boolean authenticate(String password){
    return this.password.equals(password);
  }


  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password) && withdraw(amount)) {
      if (other.deposit(amount)) return true;
      else return false;
    }
    else return false;
  }







}
