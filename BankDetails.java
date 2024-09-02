package BankApplication;

import java.util.Scanner;

public class BankDetails {
    private String acno;
    private String name;
    private String accountType;
    private long balance;
    Scanner sc=new Scanner(System.in);

//    BankDetails(String acno,String name, String accountType, long balance){
//        this.acno=acno;
//        this.name=name;
//        this.accountType=accountType;
//        this.balance=balance;
//    }
        public void createAccount(){
            System.out.println("Enter your name: ");
            name=sc.next();
            System.out.println("Enter your Account Number: ");
            acno= sc.next();
            System.out.println("Enter your account type: ");
            accountType= sc.next();
            System.out.println("Enter your balance: ");
            balance=sc.nextLong();
            System.out.println();
        }

        public void display(){
        System.out.println("The Bank Account Details: ");
        System.out.println("Bank account number is: "+this.acno);
        System.out.println("Name of the account holder is: "+this.name);
        System.out.println("Type of the account is: "+this.accountType);
        System.out.println("Account balance is "+this.balance);
    }
    public void withdrawal(){
        System.out.println("Enter the amout to be withdrawn: ");
        long amount= sc.nextLong();
        if(amount<this.balance){
            balance-=amount;
            System.out.println("Withdrawal is successful");
            System.out.println("Remaining balance is: "+this.balance);
        }
        else{
            System.out.println("Invalid amount or insufficient balance");
        }
        display();
    }
    public void deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        long amount=sc.nextLong();
        if(amount>0) {
            balance += amount;
            System.out.println("Amount deposited successfully!!");
        }
        else
            System.out.println("Invalid amount");
        display();
    }

    public boolean search(String ac_no){
            if(acno.equals(ac_no)) {
                display();
                return true;
            }
            return false;
    }
}

