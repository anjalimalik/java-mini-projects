/**
 * Created by anjalimalik
 */


import java.util.ArrayList;
import java.util.Random;


    public class BankAccount {
        //instance variables
        private int accountNumber;
        private String name;
        private double balance;

        //static properties
        private static double interest = 0.3;
        private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        private static int numaccounts = 0;

        //The first constructor receives a name and creates bank account with balance = 0
        public BankAccount (String name) {
            //1.1
            this(name, 0);
        }

        //The second constructor receives name and balance, creates a bank amount and updates balance
        public BankAccount (String name, double balance) {
            //1.2

            this.name = name;
            this.balance += balance;

            Random random = new Random();
            this.accountNumber = (random.nextInt(900000) + 99999);

            //accounts.add(BankAccount );
            numaccounts += 1 + accounts.size();
            //double rate = 0.30 - interest;
            //int num = (int)((rate/2) * 500);
            if(numaccounts % 5 == 0) {
                interest -= 0.02;
            }

        }

        //This method performs deposit operation
        public double deposit(double money) {
            //2
            if(money < 0) {
                return -1;
            } else {
                this.balance += money;
                return money;
            }
        }

        //This method performs withdraw operation
        public double withdrawMoney(double money) {
            //3
            if((money < 0) || (money > this.balance)) {
                return -1;
            } else {
                this.balance -= money;
                return money;
            }

        }

        //This method returns account number
        public int getAccountNumber() {
            //4
            return this.accountNumber;
        }

        //This method returns interest rate
        public static double getInterestRate() {
            //5
            //System.out.println(interest);
            return interest;
        }

        //This method performs a transfer operation to a single bank account
        public double transfer(BankAccount destinationBankAccount, double amount) {
            //6
            if ((amount < 0) || (destinationBankAccount == null) || (this.balance < amount)) {
                return -1;
            } else {
                this.balance -= amount;
                destinationBankAccount.deposit(amount);
                return amount;
            }
        }

        //This method performs a transfer operation to multiple accounts
        public double transfer(BankAccount[] destinationBankAccount, double amount) {
            //7
            if((destinationBankAccount == null) || (amount < 0) || (destinationBankAccount.length == 0)) {
                return -1;
            }

            double totalamount = (amount * destinationBankAccount.length);

            if(totalamount > this.balance) {
                return -1;
            } else {
                this.balance -= (amount * destinationBankAccount.length);
            }

            for(int i = 0; i < destinationBankAccount.length; i++) {
                if (destinationBankAccount[i] == null) {
                    return -1;
                } else {
                    destinationBankAccount[i].deposit(amount);
                }
            }

            return totalamount;
        }

    }
