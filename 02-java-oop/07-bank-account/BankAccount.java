import java.util.Random;

public class BankAccount {
    private String accountNum;
    private double checkingBalance = 0;
    private double savingsBalance = 0;

    private static int accountsCreated = 0;
    private static double totalAmount = 0;

    //Create a private method that returns a random ten digit account number
    //In the constructor, call the private method from above so that each user has a random ten digit account

public BankAccount() {
    createAccNum();
    }


public String getAccNum(){
    return accountNum;
    }

private String createAccNum(){
    String numbers = "0123456789";
    String newAccNum = "";

    Random random = new Random();

    for (int i = 0; i < 5; i++){
        int num = numbers.charAt(random.nextInt(10));
        newAccNum += num;
        }

    accountNum = newAccNum;
    return newAccNum;
    }

public int createAcc(){
    return accountsCreated++;
}

public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
    }
    
public double getCheckingBalance(){
    System.out.println("Account checking balance is : $" + this.checkingBalance);
    return this.checkingBalance;
    }
    
public void setSavingsBalance(double savingsBalance){
    this.savingsBalance = savingsBalance;
    }
    
public double getSavingsBalance(){
    System.out.println("Account savings balance is : $" + this.savingsBalance);
    return this.savingsBalance;
    
    }
    
public void depositChecking(double checkingBalance){
    this.setCheckingBalance(checkingBalance);
    totalAmount += checkingBalance;
    }
    
public void depositSavings(double savingsBalance){
    this.setSavingsBalance(savingsBalance);
    totalAmount += savingsBalance;
    }
    
public double total(){
    totalAmount = savingsBalance + checkingBalance;
    return totalAmount;
    }
    
public void withdrawalChecking(int amount){
    if (getCheckingBalance() < Double.valueOf(amount)){
        System.out.println("Insufficient funds in checking account.");
    } 
    else{
        setCheckingBalance(getCheckingBalance() - Double.valueOf(amount));
    
        }
    }
    
public void withdrawalSavings(int amount){
    if (getSavingsBalance() < Double.valueOf(amount)){
        System.out.println("Insufficient funds in savings account.");
    } 
    else{
        this.setSavingsBalance(this.getSavingsBalance() - Double.valueOf(amount));
        }
    
    }
    }