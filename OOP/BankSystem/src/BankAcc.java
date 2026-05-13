public class BankAcc {
    private final String accountHolder;
    private double balance;

    BankAcc(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit (double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited " + amount + " successfully to " + accountHolder);
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Invalid amount");
        } else if (amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawn " + amount + " successfully from " + accountHolder);
        }
       /* if (amount <= balance){
            if(amount > 0 ){
                balance -= amount;
            } else {
                System.out.println("Invalid amount");
            }
        }
*/
    }
    void display(){
        System.out.println(accountHolder + " has " + balance + "\n");
    }
}
