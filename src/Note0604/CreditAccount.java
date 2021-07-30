package Note0604;

public class CreditAccount extends Account {
    public CreditAccount() {
    }

    public CreditAccount(String actno, double balance, double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    private double credit;


}
