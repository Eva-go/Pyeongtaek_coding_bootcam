package Test;

public class Account {
    private int deposit;
    private  int withdraw;
    public int balancce;

    public Account(int balancce, int deposit, int withdraw) {
        this.balancce = balancce;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }
    public Account(int balancce) {
        this.balancce = balancce;
    }
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getDeposit() {
        balancce+=deposit;
        return deposit;
    }

    public int getWithdraw() {
        balancce-=withdraw;
        return withdraw;
    }

    public int Balancce() {
        return balancce;
    }

}
