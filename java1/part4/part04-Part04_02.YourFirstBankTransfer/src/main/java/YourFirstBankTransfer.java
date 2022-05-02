
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here

        Account mattAccount = new Account("Matthews account", 1000.00);
        Account meAccount = new Account("My account", 0.00);

        mattAccount.withdrawal(100.0);
        meAccount.deposit(100.0);
        System.out.println(mattAccount);
        System.out.println(meAccount);
    }
}
