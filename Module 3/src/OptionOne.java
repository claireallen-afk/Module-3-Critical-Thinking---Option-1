import java.util.Scanner;

public class OptionOne {
	public static void main (String [] args) {
	      Scanner scnr = new Scanner(System.in);
	      
	      double income = scnr.nextDouble();
	      double taxRate = 0.0;
	      double weeklyAverageTax;
	      
	      if (income < 500) {
	    	  taxRate = 0.10;
	      }
	      else if ( (income >= 500) && (income < 1500) ) {
	    	  taxRate = 0.15;
	      }
	      else if ( (income >= 1500) && (income < 2500) ) {
	    	  taxRate = 0.20;
	      }
	      else if (income >= 2500) {
	    	  taxRate = 0.30;
	      }
	      
	      weeklyAverageTax = income * taxRate;
	      
	      System.out.println("Weekly average tax is: $" + weeklyAverageTax);
	}   
}
	 
