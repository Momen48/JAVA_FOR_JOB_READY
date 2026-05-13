public class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
    void addInterest(){
        balance+= balance* interestRate;
        System.out.println("Interest added : " + balance);
    }
}
