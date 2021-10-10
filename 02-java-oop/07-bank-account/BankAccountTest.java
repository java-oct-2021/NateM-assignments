public class BankAccountTest{
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        
        System.out.println("Bank account number is : " + account1.getAccNum());
        account1.getCheckingBalance();
        account1.getSavingsBalance();
        account1.depositChecking(250);
        account1.depositSavings(3000);
        account1.withdrawalChecking(50);
        System.out.println(account1.getCheckingBalance());
        account1.withdrawalSavings(1500);
        System.out.println(account1.getSavingsBalance());
        account1.total();
        System.out.println("The total amount in both the checking and savings accounts for this account is : $" + account1.total());
        
}
}