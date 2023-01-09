

import java.util.*;

public class BankAccount {
       
        private String accType; 
        public int accountNumber; 
        private double balance; 
               
        public BankAccount(String anOwnerName, int anAccountNumber, double openingBalance){
                accType = anOwnerName;
                accountNumber = anAccountNumber;
                balance = openingBalance;
        }
                               
        private void Transaction(String transactionType, double openingBalance){
                
                System.out.println("accType: " + accType + " ----- " + "Account: #" + accountNumber + " ----- " + "Transaction: " + transactionType + " ----- " + "Opening Balance: " + "R" + openingBalance + " ----- " + "Closing Balance: " + "R" + balance);
        }

        public BankAccount summery(double anAmount){
               
               
                double openingBalance = balance;               
                balance = (balance);       
                Transaction("DEPOSIT ", openingBalance);
                return this; 
        }
       
        public BankAccount buyAirtime(double anAmount){       
               
                double openingBalance = balance;               
                balance = (balance) - anAmount;   
                Transaction("Airtime ", openingBalance);
                return this; 
        }
       
       
        public BankAccount withdraw(double anAmount){
               
                
        double openingBalance = balance;
       
                balance = (balance) - anAmount ;  
                Transaction("WITHDRAW", openingBalance);
              return this;
        }
               
        public String toString(){
                return "accType: " + accType + " ----- " + "Account: #" + accountNumber + " ----- " + "Balance: " + "R" + balance + " ----- ";
        }
}