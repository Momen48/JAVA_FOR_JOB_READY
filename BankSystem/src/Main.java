public class Main {
    static void main(String[] args) {
        BankAcc b1 = new BankAcc("Alex", 20000);
        b1.deposit(5000);
        b1.withdraw(15000);
        b1.display();

        BankAcc b2 = new BankAcc("Jayson", 15000);
        b2.deposit(70000);
        b2.withdraw(55000);
        b2.display();
    }
}
