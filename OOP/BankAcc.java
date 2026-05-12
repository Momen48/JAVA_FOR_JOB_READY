public class BankAcc {
    private  double balance;

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    static void main(String[] args) {
        BankAcc b1 = new BankAcc();
        b1.deposit(1000);
        System.out.println(b1.getBalance());
    }
}
