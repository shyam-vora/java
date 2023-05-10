import java.util.Scanner;

import javax.management.InstanceNotFoundException;
import javax.naming.InsufficientResourcesException;
import javax.sound.sampled.SourceDataLine;

class Account
{
    int balance=10000;
    // int actnum;
    // Account()
    // {
    //     Scanner sc=new Scanner(System.in);
    //     actnum=sc.nextInt(); 
    // }

    // void deposite(int d){
    //     balance += d;
    // }
    void withdraw(int  w)
    {
        try{
            if(balance-w<1000)
            {
                throw new Exception("minmum balance is not in your bank account");
            }
            else
            {
                balance=balance-w;
            }
        } 
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
    }
    void balance()
    {
        System.out.println(balance);
    }
}
 public class p145
 {
    public static void main(String[] args)
     {
       Account a1 = new Account();
       Scanner sc=new Scanner(System.in);
       int w=sc.nextInt();
    a1.withdraw(w);
       a1.balance();
    }
}
// import java.util.Scanner;
// class InsufficientFundException extends Exception 
// {
// public InsufficientFundException(String message)
//  {
// super(message);
// }
// }
// class Account
//  {
// private double accountBalance;

// public Account( double balance)
// {
// accountBalance = balance;
// }

// public void deposit(double amount) {
// accountBalance += amount;
// System.out.println("Deposited " + amount + " successfully.");
// displayBalance();
// }
// public void withdraw(double amount) throws InsufficientFundException {
// if (amount > accountBalance) {
// throw new InsufficientFundException("Insufficient balance. Cannot withdraw.");
// } else {
// accountBalance -= amount;
// System.out.println("Withdrawn " + amount + " successfully.");
// displayBalance();
// }
// }

// public void displayBalance() {
// System.out.println("Account balance: " + accountBalance);
// }
// }

// public class Program5 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter account balance: ");
// double balance = sc.nextDouble();

// Account acc = new Account(balance);
// System.out.println("Account created successfully.");
// acc.displayBalance();
// System.out.print("Enter amount to deposit: ");
// double depositAmount = sc.nextDouble();
// acc.deposit(depositAmount);

// System.out.print("Enter amount to withdraw: ");
// double withdrawAmount = sc.nextDouble();
// try {
// acc.withdraw(withdrawAmount);
// } catch (InsufficientFundException e) {
// System.out.println(e.getMessage());
// }
// }
// }