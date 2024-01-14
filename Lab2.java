  /************************************************************************
 * Program Name   : Lab2 - Sales Report
 * Author         : Brandon LaPointe
 * Date           : 9/24/2020
 * Course/Section : CSC 111 - 304
 * Program Description: Create a program that will calculate the cost of a
 * 		ticket order for Scheemaker Stadium and display the receipt for the customer
 * 		on the screen. There are 2 ticket prices: adult, and senior citizen. Adult
 * 		seats are $4.50 and senior citizen seats are $3.50. If more than 5 senior
 * 		citizen tickets are purchased, the customer gets an extra 20% off the ticket
 * 		order. If more than 10 regular seats are purchased, the customer gets an
 * 		additional 10% off the cost of the order. A customer can only place an order
 * 		for one type of ticket. Output the type of ticket purchased, the number of
 * 		tickets purchased, the gross cost, the amount of the discount, and the final
 * 		cost of the order.
 *
 * Methods:
 * -------
 * main - calculates %, items sold, and displays sales report
 *
 ************************************************************************/

import java.util.Scanner;

public class Lab2
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/24/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will calculate the cost of a
	*    ticket order for Scheemaker Stadium and output the type of ticket purchased,
 	*    the number of tickets purchased, the gross cost, the amount of the discount,
 	* 	 and the final cost of the order.
    *
    * BEGIN Display Sales Receipt
    *    Init Disc rate = 0
    *	 Input Ticket Type
    *	 Input Num Tickets Purchased
    *	 Clear the screen
    *	 IF(Ticket Type is Sr)
    *	    Ticket Price = Sr Ticket Price
    *	    IF (There is a Sr Discount)
    *	       Disc Rate is the Sr Disc Rate
    *	    END IF
    *	    ELSE //(ticket type must be adult)
    *	    Ticket Price is Adult
    *	    IF (There is an Adult Discount)
    *	       Disc Rate is the Adult Disc Rate
    *	    END IF
    *    END IF
    *	 Calculate Gross Cost
    *	 Calculate the Disc
    *	 Calculate the Final Cost
    *	 Display Sales Receipt
    * END Display Sales Receipt
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants
		final int ADULT_TICKET 		 = 1;
		final int SR_TICKET 		 = 2;
		final double ADULT_PRICE 	 = 4.50;
		final double SR_PRICE 		 = 3.50;
		final double ADULT_DISC_RATE = .1;
		final double SR_DISC_RATE 	 = .2;

		//local variables
		int ticketType;			//Adult or Sr Ticket (1 = Adult, 2 = Sr)
		int numPurchased;		//Number of tickets purchased
		double ticketPrice; 	//Price of single ticket purchased
		double grossCost;		//Cost of tickets purchased before discount
		double discRate = 0;	//Rate of discount for tickets purchased
		double totalDisc;		//Total amount of discount
		double finalCost;		//Cost after discount applied

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/
		//Init Disc rate = 0

		//Input Ticket Type
		System.out.print("1 for Adult Ticket\n" +
		                 "2 for Senior Ticket\n" +
		                 "Enter the Ticket Type: ");
		ticketType = Scan.nextInt();
		System.out.print ("\n");

  		//Input Num Tickets Purchased
  		System.out.print("Input Number of Tickets Purchased: ");
  		numPurchased = Scan.nextInt();

		//Clear the screen

		//Calculate Gross Cost
			if (ticketType == 2)
			{
				ticketPrice = SR_PRICE;
			}
			else
			{
				ticketPrice = ADULT_PRICE;
			}
			grossCost = ticketPrice * numPurchased;

		//Calculate the Disc
			if (numPurchased >= 6 && ticketPrice == SR_PRICE)
			{
				discRate = SR_DISC_RATE;
			}
			if (numPurchased >= 11 && ticketPrice == ADULT_PRICE)
			{
				discRate = ADULT_DISC_RATE;
			}
			totalDisc = discRate * numPurchased;

		//Calculate the Final Cost
			finalCost = grossCost - totalDisc;

		//Display Sales Receipt
			System.out.print ("\n\n\tYour Scheemaker Stadium Sales Receipt: ");
			System.out.print ("\n\n\t\tTicket Type:       " + ticketType);
			System.out.print ("\n\n\t\tTickets Purchased: " + numPurchased);
			System.out.print ("\n\n\t\tGross Total:       $" + grossCost);
			System.out.print ("\n\n\t\tDiscount Amount:   $" + totalDisc);
			System.out.print ("\n\n\t\tEnd Total:         $" + finalCost);
			System.out.print ("\n\n");

	} //end main method

} //end Lab02
