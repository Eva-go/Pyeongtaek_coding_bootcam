package Test;

public class AccountMain {
    public static void main(String[] args) {
        Account a1 = new Account(0);
        Account a2 = new Account(0);

        a1.setDeposit(10000);
        a1.getDeposit();
        a1.setWithdraw(3000);
        a1.getWithdraw();
        a2.setWithdraw(10000);
        a2.getWithdraw();
        a2.setDeposit(50000);
        a2.getDeposit();

        System.out.println(a1.Balancce());
        System.out.println(a2.Balancce());

    }
}
