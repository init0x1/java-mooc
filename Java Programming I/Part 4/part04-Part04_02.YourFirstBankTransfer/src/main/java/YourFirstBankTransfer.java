
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account Matthews = new Account("Matthews account",1000.0);
        Account MyAccount = new Account("My account",0.0);
        Matthews.withdrawal(100.0);
        MyAccount.deposit(100.0);
        System.out.println(Matthews);
        System.out.println(MyAccount);
    }
}
