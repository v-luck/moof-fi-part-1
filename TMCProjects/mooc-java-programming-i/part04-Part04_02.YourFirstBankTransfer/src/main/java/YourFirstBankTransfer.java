
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account mathewAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        mathewAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mathewAccount);
        System.out.println(myAccount);
        // write your program here
    }
}
