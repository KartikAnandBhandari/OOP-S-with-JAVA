package Balance;  
public class Account {
    private double balance;  

    
    public Account(double balance) {
        this.balance = balance;
    }

    public void Display_Balance() {
        System.out.println("Account Balance: $" + balance);
    }
}
