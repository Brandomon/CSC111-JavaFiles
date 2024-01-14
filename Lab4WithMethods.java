/**********************************************************
 * Program Name   : Display Parking Receipt
 * Author         :
 * Date           :
 * Course/Section : CSC111
 * Program Description: This program will calculate the cost
 *     of parking in the OCC Preferred Parking Lot and display
 *     a receipt on the screen.
 *
 * Methods:
 * -------
 * main - calculate the area of a circle and display it
 * inputPlate(String) : inputs from the keyboard and returns the plate number
 * validPlate		  : checks for the plate number being too long and returns a boolean
 * calcDiscRate		  : will calc a discount rate of 0, .1, .2, .3, .4, .5
 * displayReceipt
 * closingMessage
 **********************************************************/
import java.util.*;
import java.text.*;

public class Lab4WithMethods
{
	//class constants

	//class variables
	static Scanner scan = new Scanner(System.in);

	/*********************************************************
	* Method Name    : Parking Receipt
	* Author         :
	* Date Due       : October 20, 2020
	* Course/Section : CSC 111-304
	* Program Description: Calculate the cost of parking in the OCC Preferred Parking Lot.
	*    Cost to park in the lot is $7.50.  This weekend the OCC is having a special discount.
	*    Anyone who parks in the lot could get a discount of up to 50%.  Input the car?s License Plate Number
	*    and then display a receipt for the customer.  The plate number should be less than 8 characters long.
	*    If the plate number is more than 8 characters, display an error instead of the receipt.
	*    Make sure that the license plate number has no lowercase letters when it is displayed.
	*    Use the random number generator to create a discount rate of either:  0, 10, 20, 30, 40 or 50%..
	*    Calculate the amount of the discount, the final cost of parking, and then display the receipt as shown below.
	*    Continue until a sentinel value is entered for the license plate number.
	*
	* BEGIN Display Parking Receipt
	* 	Input plate number (or Quit)
	*   Clear the Screen
	* 	WHILE (plate number is not Quit)
	*		IF (the plate number is not too long)
	*			Create random discount rate
	*			Calculate discount
	*			Calculate final cost
	*			Display receipt
	*		ELSE
	*			Display error message
	*		END IF
	*		Pause the screen (ask for any input)
	*		Clear the screen
	*		Input plate number (or Quit)
	*	END WHILE
	*	Clear Screen
	*	Display a closing message
	* END Display Parking Receipt
    **********************************************************/
	public static void main (String [] args)
	{
		//local constants
		final String QUIT       = "!!";//Quit value for while loop
		final double GROSS_COST = 7.50;	//Price of the ticket

		//local variables
		String plateNum;	//The plate number
		String input;		//Used to pause the screen after a reciept is displayed
		double discount;	//Store the price of the discount
		double finalCost;	//Stores the final cost of the ticket
		double discRate;	//The percentage taken off the ticket

		/******************************************************************/

		//Input plate number (or quit)
		plateNum = inputPlate(QUIT);

		//Clear the Screen
		Util.cls();

		//While plate number is not Quit
		while (!plateNum.equals(QUIT))
		{
			//IF (the plate number is not too long)
			if (validPlate(plateNum))
			{
				//Calculate the dicount rate
				discRate = calcDiscRate();

				//Calculate discount
				discount = GROSS_COST * discRate;

				//Calculate the final cost
				finalCost = GROSS_COST - discount;

				//Display the receipt
				displayReceipt(plateNum, discRate, discount, GROSS_COST, finalCost);
			}
			else //Plate number is too long
			{
				//Displays error
				System.out.print("\n\n" + Util.center("ERROR LICENSE PLATE IS TOO MANY CHARACTERS"));
			}
			//Pause the screen (ask for any input)
			System.out.print(Util.center("\n\nEnter Any Input"));
			input = scan.nextLine();

			//Clear Screen
			Util.cls();

			//Input plate number (or Quit)
			plateNum = inputPlate(QUIT);

		}//end while

		//Clear Screen
		Util.cls();

		//Display closing message
		System.out.println("\n\n" + Util.center("Thank You For Using Parking Lot Receipt Program"));

	 }//end main method

	/*******************************************************************************
	* Method Name    : inputPlate
	* Author         :
	* Date Due       :
	* Course/Section : CSC 111-304
	* Method Description:
	*
	* BEGIN inputPlate
	*    Input plate number from the user
	*    return plate number
	* END inputPlate
    **********************************************************/

     public static String inputPlate(String quit)
     {
		 //local constants

		 //local variables
		 String plateNum;    //fiyfdytycyfckyfcky

		 /*************************************************/

		//Input plate number (or quit)
		System.out.print("\n\n\tPlate number or " + quit + " to quit:");
		plateNum = scan.nextLine();

		//return the user inputted plate number
		return plateNum;

	 }//end inputPlate method

	/*********************************************************************************
	* Method Name    : validPlate
	* Author         :
	* Date Due       :
	* Course/Section : CSC 111-304
	* Method Description:
	*
	* BEGIN validPlate
	*    Initialize valid flag to true
	*    IF (plate number is too long)
	*       set valid flag to false
	*    END IF
	*    return valid flag
	* END validPlate
    **********************************************************/

     public static boolean validPlate(String plate)
     {
		 //local constants
		 final int MAX_PLATE_LEN = 8;	//Max length of the plate (exclusive)

		 //local variables
		 boolean valid = true;		//Indicates if plate is valid or not


		 /*************************************************/

		//IF (plate number is too long)
		if (plate.length() > MAX_PLATE_LEN)

			//set valid flag to false
			valid = false;

			//return valid flag
			return valid;

	 }//end validPlate method

	/*********************************************************************************
	* Method Name    : calcDiscRate
	* Author         :
	* Date Due       :
	* Course/Section : CSC 111-304
	* Method Description:
	*
	* BEGIN calcDiscRate
	*    Calculate discount rate as a decimal
	*    return discount rate
	* END calcDiscRate
    **********************************************************/

     public static double calcDiscRate()
     {
		 //local constants
		 final int DISC_RANGE = 6;	//Max length of plate (exclusive)
		 //local variables
		 double rate;				//indicates if plate is valid or not
		 Random gen = new Random();

		 /*************************************************/

		//calculate the discount rate
		rate = gen.nextInt(DISC_RANGE) * .1;

		//return discount rate
		return rate;

	 }//end calcDiscRate method

	/*********************************************************************************
	* Method Name    : displayReceipt
	* Author         :
	* Date Due       :
	* Course/Section : CSC 111-304
	* Method Description:
	*
	* BEGIN displayReceipt
	*    Display Receipt
	* END displayReceipt
    **********************************************************/

     public static double displayReceipt(double rate, double disc, double gross, double finalCost)
     {
		 //local constants

		 //local variables
		 NumberFormat pct = NumberFormat.getPercentInstance();
		 NumberFormat currency = NumberFormat.getCurrencyInstance();

		 /*************************************************/

		 //display the receipt
		 System.out.println("\n\n" + (Util.center("OCC Preferred Parking Lot")                        + "\n"   +
						   (Util.setLeft(39, "License Plate")) + Util.setRight(23,plateNum.toUpperCase()) + "\n" +
						   (Util.setLeft(39, "Discount Rate")) + Util.setRight(23,pct.format(rate))   + "\n" +
						   (Util.setLeft(39, "Gross Cost:")) + Util.setRight(26,""  + currency.format(gross)) + "\n"   +
						   (Util.setLeft(39, "Discount  :" )) + Util.setRight(26,""  + currency.format(disc))	 + "\n\n" +
						   (Util.setLeft(39, "Final Cost:"   )) + Util.setRight(26,""  + currency.format(finalCost))  + "\n"   ));

		 //return discount rate
		 return rate;

	 }//end displayReceipt method

}//end Lab4WithMethods