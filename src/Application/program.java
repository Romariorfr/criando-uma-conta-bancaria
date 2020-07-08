package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class program {

	public static void main(String[] args) {
		
		//instance of account
		Account account = new Account();
		
		//instance of scanner
		Scanner sc = new Scanner(System.in);
	
		Locale.setDefault(Locale.US); //set locale US
		
		//info number account
		System.out.print("Enter Account number: ");
		int number = sc.nextInt();
		
		//info name account
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		//repeat code while response is wrong
		boolean repeat = false;
		while(repeat == false) {
			
			//there will be deposit?
			System.out.print("Is there initial deposit? (y/n) ");
			char response = sc.next().charAt(0);
			
			switch (response) {
			
			  //case yes
			  case 'y':
				  System.out.print("Enter the initial deposit value: ");
				  double initialDeposit = sc.nextDouble();
				  account = new Account(number,name,initialDeposit);
				  System.out.println("");
				  System.out.println("Account data:");
				  System.out.println(account);
				  repeat = true;
				  break;
			
			  //case not
			  case 'n':
				  System.out.println("");
				  account = new Account(number,name);
				  System.out.println("Account data:");
				  System.out.println(account);
				  repeat = true;
				  break;
				  
		      default:
		    	  System.out.println("Response wrong, try again...");
		    	  repeat = false;
			}
		}
		
		//info withdraw value
		System.out.print("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		System.out.println("");
		account.withdraw(withdraw);
		
		//update info account
		System.out.println("Updade account data:");
		System.out.println(account);
		
		//close scanner
		sc.close();
	}

}
