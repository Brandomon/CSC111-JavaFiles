  /************************************************************************
 * Program Name   : Lab4 - Cost of Parking
 * Author         : Brandon LaPointe
 * Date           : 10/21/2020
 * Course/Section : CSC 111 - 304
 * Program Description: Calculate the cost of parking in the OCC Preferred
 *   Parking Lot.  Cost to park in the lot is $7.50.  This weekend the OCC
 *   is having a special discount. Anyone who parks in the lot could get a
 *   discount of up to 50%.  Input the car’s License Plate Number and then
 *   display a receipt for the customer.  The plate number should be less
 *   than 8 characters long. If the plate number is more than 8 characters,
 *   display an error instead of the receipt.  Make sure that the license
 *   plate number has no lowercase letters when it is displayed.  Use the
 *   random number generator to create a discount rate of either:  0, 10,
 *   20, 30, 40 or 50%..  Calculate the amount of the discount, the final
 *   cost of parking, and then display the receipt. Continue until a
 *   sentinel value is entered for the license plate number.
 *
 * Methods:
 * -------
 * main - calculates %, items sold, and displays sales report
 *
 ************************************************************************/

import java.util.*;
import java.text.*;

public class Lab4
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 10/21/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will Calculate the cost of parking
    *   in the OCC Preferred Parking Lot.
    *
	* BEGIN Display Parking Receipt
	*    Input License Plate Number (or quit)
	*    WHILE (plate is not quit)
	*       IF (plate is not too long)
	*          Calculate random discount rate
	*			   Calculate random number between 0 and 5
	*		       Multiply random number by 10 to get discount rate
	*          	   Calculate discount
	*              Calculate final cost
	*		   Display Receipt
	*		END IF
	*    	ELSE
	*          Display "Error: License plate number too long"
	*    	END ELSE
	*		Input license plate number (-1 to quit)
	*    END WHILE
	* END Display Parking Receipt
	**********************************************************/

	public static void main(String[] args)
	{
		//local constants
		final int DISCOUNT_RATE_MULT = 10;
		final double BASE_PRICE = 7.50;

		//local variables

		String plate;			//String input of plate number
		int plateCount;			//Number of characters within plate number
		int randNum;			//Random number generated for random discount
		double discRate;		//Random discount rate applied
		double discount;		//Total discount of sale
		double finalCost;		//Final cost of sale

		Scanner Scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		Random rand = new Random();

		/********************   Start main method   *********************/
		System.out.print("Input License Plate Number (Enter quit to end): ");
		plate = Scan.nextLine();
		Util.cls();
		while (!plate.equals("quit"))
		{
			plateCount = plate.length();
			if (plateCount <= 8)
			{
				randNum = rand.nextInt(6);
				discRate = randNum * DISCOUNT_RATE_MULT;
				discount = discRate / 100 * BASE_PRICE;
				finalCost = BASE_PRICE - discount;
				System.out.println("\n");
				System.out.println(Util.setLeft(48, "OCC Preferred Parking Lot\n"));
				System.out.println(Util.setLeft(48, "License Plate" ) + Util.setRight(12, "" + plate));
				System.out.println(Util.setLeft(48, "Discount Rate" ) + Util.setRight(11, "" + discRate) + "%");
				System.out.println(Util.setLeft(48, "Gross Cost" ) + Util.setRight(15, "" + "$" + fmt.format(BASE_PRICE)));
				System.out.println(Util.setLeft(48, "Discount" ) + Util.setRight(17, "" + "$" + fmt.format(discount)));
				System.out.println("\n" + Util.setLeft(48, "Final Cost" ) + Util.setRight(15, "" + "$" + fmt.format(finalCost)) + "\n\n" );
			} //end if
			else
			{
				System.out.println("\n\n" + Util.setLeft(48, "ERROR: License plate number too long\n\n" ));
			} //end else
			System.out.print("Input license plate number (Enter quit to end): ");
			plate = Scan.nextLine();
			Util.cls();
		} //end while

	} //end main method

} //end Lab4
