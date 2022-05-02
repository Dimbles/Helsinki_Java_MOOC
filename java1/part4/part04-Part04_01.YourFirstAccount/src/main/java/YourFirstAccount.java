
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account newAccount = new Account("New Account", 100.00);
        newAccount.deposit(20.0);
        System.out.println(newAccount);
    }
}
