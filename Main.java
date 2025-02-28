import Balance.Account;  // Import Account class from the Balance package

public class Main {
    public static void main(String[] args) {
        // Create an Account object with a balance of 5000
        Account myAccount = new Account(5000.00);

        // Call Display_Balance method
        myAccount.Display_Balance();
    }
}
