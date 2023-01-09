
import java.util.*;

public class MainProgram {
   
    public static void main(String[] args) {

		String lineSeparator = System.getProperty("line.separator");
        Scanner scanner;       
        Date today;
        today = new Date();                                                                      //this initilizes the date
        scanner = new Scanner(System.in);                                                                             //initializes the scanner so input is possible
        scanner.useDelimiter(lineSeparator);
        double transAmount;
		String pin = "1234";
        int transOption;
		
        int transNumber;
        boolean userWantsToQuit = false;
		
		
		Scanner scan1 = new Scanner(System.in);
			 String ussd = "*120*3279#";
			 System.out.println("Enter your USSD ");
				String input = scan1.next();
			
			if(ussd.equals(input))
			{
				
				
				System.out.println("Enter your mobile pin ");
				String pinCode = scan1.next();
				
				if(pinCode.equals(pin))
				{
					
					
        //create some bank account objects
        BankAccount b1 = new BankAccount("Savings 	    ", 1001, 1000.0);
        BankAccount b2 = new BankAccount("Live better Savings", 1002, 0.0);
        BankAccount b3 = new BankAccount("Cheque		  ", 1003, 500.0);
          
		while (!userWantsToQuit){

                System.out.println("The Time Is: " + today);
                System.out.println("Welcome To Mobile Account.");
                System.out.println("There Are Three Account For You.");
                System.out.println("");
                System.out.println("");
                System.out.println("                HERE IS THE LIST OF ACCOUNTS");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println(b1);
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println(b2);
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println(b3);
                System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("");
				System.out.println("Would You Like To Do:" );
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("Buy Prepaid           (1)");
                System.out.println("Check balance         (2)");
                System.out.println("Account Summery       (3)");
                System.out.println("History               (4)");
                    System.out.println("-------------------------------------------------------------------------------------");
                                transOption = scanner.nextInt();
                System.out.println("");
                System.out.print("From Which Account would you like to perform a transaction - Enter In An Account Number: ");
                                transNumber = scanner.nextInt();                         
                System.out.println("");
                
                                        if(transNumber == b1.accountNumber &&transOption == 1){
                                 System.out.println("add a beneficiary cellphone number");
								 String num = scanner.next();
								 if(num.length()==10){
									System.out.println("Number added successfully");
								 System.out.println("Enter the amount for prepaid purchase");
                                                transAmount = scanner.nextDouble();
                                                b1.buyAirtime(transAmount);}
                      }
                      
                      else if(transNumber == b1.accountNumber && transOption == 2){
                         b1.summery(0);
                      }
                      else if(transNumber == b1.accountNumber && transOption == 4){
                                System.out.println("UNDER CONSTRUCTION");
                                                transAmount = scanner.nextDouble();
                         b1.buyAirtime(transAmount);
                      }
                                        if(transNumber == b2.accountNumber && transOption == 1){
                                System.out.println("add a beneficiary cellphone number");
								 String num = scanner.next();
								 if(num.length()==10){
									System.out.println("Number added successfully");
								 System.out.println("Enter the amount for prepaid purchase");
                                                transAmount = scanner.nextDouble();
                                                b1.buyAirtime(transAmount);}
                            
                      }
                      
                         
                      
                      else if(transNumber == b2.accountNumber && transOption == 2){
                         b2.summery(0);
                      }
                                        if(transNumber == b3.accountNumber && transOption == 1){
                                System.out.println("add a beneficiary cellphone number");
								 String num = scanner.next();
								 if(num.length()==10){
									System.out.println("Number added successfully");
								 System.out.println("Enter the amount for prepaid purchase");
                                                transAmount = scanner.nextDouble();
                                                b1.buyAirtime(transAmount);}
                            
                      }
                      
                      else if(transNumber == b3.accountNumber && transOption == 2){
                         b3.summery(0);
                      }
                             System.out.println("");
                                System.out.println("After Transactions:");
                                System.out.println("===================");
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println(b1);
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println(b2);
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println(b3);
                                System.out.println("-------------------------------------------------------------------------------------");
                                        System.out.println("");
                                        System.out.print("Do You Want to Perform Another Transaction? [Y or N] ");
                                        String userResponse = scanner.next();
                                                if(userResponse.startsWith("Y") || userResponse.startsWith("y")){              //the user can end the application here
                                                        userWantsToQuit = false;
                                                }
                                                else{
                                                        userWantsToQuit = true;
                                                }
                }
                                        System.out.println("");
                                        System.out.println("GOODBYE");
					
				}else{
					
					System.out.println("invalid pin, try again later");
				}
			}
			else
			{
				System.out.println("Invalid USSD code try again later");
			}

   
    }
}