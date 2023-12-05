
public class YourFirstAccount {

    public static void main(String[] args) {
        Account newAccount = new Account("Jesaca", 100);
        newAccount.deposit(20);
        System.out.println(newAccount);
    }
}
