 /************************************************************************
 * Program Name   : LoopsHW3
 * Author         : Brandon LaPointe
 * Date           : 10/12/2020
 * Course/Section : CSC 111 - 304
 * Program Description: This program will input a number and display all
 * 	  of its’ divisors. A divisor is a number that divides into another
 *    without a remainder.
 *
 * Methods:
 * -------
 * main - calculates and display all of a number's divisors.
 *
 ************************************************************************/

import java.util.Scanner;

public class LoopsHW3
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 10/12/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input a number and display all
 	* 	 of its’ divisors. A divisor is a number that divides into another
	*    without a remainder.
    *
    * BEGIN Find Divisors
	* 	Input a number
	* 	Clear Screen
	*	Display "Your Divisors Are..."
	* 	WHILE (input is not QUIT)
	* 		FOR (count from 1 to (number /1))
	* 			IF(count divides evenly into number)
	*				Display count as a divisor
	*
	*			END IF
	* 		END FOR
	* 	Display number as a divisor
	* END Find Divisors
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants
		final int QUIT = -1;

		//local variables
		int div = 1;		//Divisor of input
		int input;			//Input of user
		double quotRem;		//Quotient remainder of input and divisor

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/

		//Input a number
		System.out.print("\n\n\t\tEnter an integer to show divisors (-1 to quit): ");
		input = Scan.nextInt();

		//Display "Your Divisors Are..."
		System.out.print("\n\n\t\tThe divisors are: ");

		//Calculate Divisors
		while (input != QUIT)
		{
			if (input < 0)
			System.out.print("\n\n\t\tError: Please enter a positive integer");
			if (input >= div)
			{
				quotRem = input % div;

				if (quotRem != 0)
				{
					div++;
				}
				else
				{
					System.out.print(div + ", ");
					div++;
				}
			}
			else
			{
				System.out.print("\n\n\t\tNo other divisors");
				System.out.print("\n\n\t\tEnter an integer to show divisors (-1 to quit): ");
				div = 1;
				input = Scan.nextInt();
				System.out.print("\n\n\t\tThe divisors are: ");
			}

		}

	} //end main method

} //end LoopsHW3
