/************************************************************************
 * Program Name   : Examples
 * Author         : Brandon LaPointe
 * Date           : 9/28/2020
 * Course/Section : CSC 111 - 304
 * Program Description: Input 2 integers and display them in descending order
 *
 * Methods:
 * -------
 * main - Outputs integers in descending order
 *
 ************************************************************************/

import java.util.Scanner;

public class Examples
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input 2 integers and display them in descending order
    *
    * BEGIN Display Sales Receipt
    *		Init Disc rate = 0
    *		Input Ticket Type
    *		Input Num Tickets Purchased
    *		Clear the screen
    *		IF(Ticket Type is Sr)
    *			Ticket Price = Sr Ticket Price
    *			IF (There is a Sr Discount)
    *				Disc Rate is the Sr Disc Rate
    *			END IF
    *	  	ELSE //(ticket type must be adult)
    *			Ticket Price is Adult
    *			IF (There is an Adult Discount)
    *				Disc Rate is the Adult Disc Rate
    *			END IF
    *		END IF
    *		Calculate Gross Cost
    *		Calculate the Disc
    *		Calculate the Final Cost
    *		Display Sales Receipt
    * END Display Sales Receipt
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants

		//local variables
		int numOne;			//First Number
		int numTwo;			//Second Number

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/

  		//Input First Number
  		System.out.print("Input the first integer: ");
  		numOne = Scan.nextInt();

  		//Input Second Number
		System.out.print("Input the second integer: ");
		numTwo = Scan.nextInt();

		//Order Numbers in Descending Order
		if (numOne < numTwo) {
				System.out.print("The integers in descending order is :" + numTwo + ", " + numOne);
		}	else 			 {
				System.out.print("The integers in descending order are: " + numOne + ", " + numTwo + "\n");
		}
	} //end main method

} //end Examples
