public class Debt {
    private double initialBalance;
    private double initialInterestRate;

    public Debt(double initialBalance, double initialInterestRate){
        this.initialBalance = initialBalance;
        this.initialInterestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.initialBalance);
    }

    public void waitOneYear() {
        this.initialBalance *= initialInterestRate;
    }
}
