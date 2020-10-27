public class Tester {

  public static void main(String[] args) {

    BankAccount first = new BankAccount(67, "password");

    System.out.println(first.getAccountID());
    System.out.println(first.deposit(100));
    System.out.println(first.getBalance());


  }
}
