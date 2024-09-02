package BankApplication;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int n=sc.nextInt();
        BankDetails bank[]=new BankDetails[n];
        for (int i = 0; i < bank.length ; i++) {
            bank[i]=new BankDetails();
            bank[i].createAccount();
        }
        System.out.println();

        int option;
        do{
            System.out.println("***********Banking system Application************");
            System.out.println("1. Display Detains\n 2. Deposit Amount\n 3. Withdraw Amount\n 4. Exit");
            System.out.println("Enter your choice: ");
            option=sc.nextInt();

            switch (option){
                case 1:
                    for (int i = 0; i < bank.length; i++) {
                        bank[i].display();
                    }
                    break;
                case 2:
                    System.out.println("Enter the account number: ");
                    String acno=sc.next();
                    boolean found=false;
                    for (int i = 0; i < bank.length; i++) {
                        found=bank[i].search(acno);
                        if(found){
                            bank[i].deposit();
                            break;
                        }

                    }
                    if(!found){
                        System.out.println("Enter valid account number, account number not found");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the account number: ");
                    acno= sc.next();
                    found=false;
                    for (int i = 0; i < bank.length; i++) {
                        found=bank[i].search(acno);
                        if(found){
                            bank[i].withdrawal();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Enter valid account number, account number not found");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
            }
        }
        while(option!=4);

    }
}
