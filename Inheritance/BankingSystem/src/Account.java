public class Account {
    protected double balance;
    Account(double balance){
        this.balance = balance;
    }
    void display(){
        System.out.println("Balance: " + balance);
    }
}
