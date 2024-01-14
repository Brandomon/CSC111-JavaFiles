/************************************************************************
 * Program Name   : IfElse2
 * Author         : Brandon LaPointe
 * Date           : 9/28/2020
 * Course/Section : CSC 111 - 304
 * Program Description: 3.	Input an integer and determine if it is not in
 * 		the range of 0 - 10 (inclusive).  Display a message indicating if it
 * 		is in range or not in range.
 *
 * Methods:
 * -------
 * main - Outputs product of smaller 2 of 3 integers
 *
 ************************************************************************/

import java.util.Scanner;

public class IfElse2
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input 3 integers and outputs the
    *		product of the smaller 2 integers
    *
    * BEGIN Display Product
    *		Input First Integer
    *		Input Second Integer
    *		Input Third Integer
    *		Find Two Smaller Integers
    *			IF (numOne is less than numTwo)
    *				numOne equals smlOne
    *				IF (numTwo is less than numThree)
    *					numThree equals smlTwo
    *				END IF
    *			ELSE
    *				numTwo equals smlOne
    *				IF (numOne is less than numThree)
    *					numOne equals smlTwo
    *				END IF
    *			END IF
    *		Calculate Product
    *		Display Product
    * END Display Product
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants

		//local variables
		int intOne;			//First Integer
		int intTwo;			//Second Integer
		int intThree;		//Third Integer
		int smlOne = 0;		//First Small Integer
		int smlTwo = 0;		//Second Small Integer
		int product;		//Product of Two Smaller Integers

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/

  		//Input First Integer
  		System.out.print("Input the first integer: ");
  		intOne = Scan.nextInt();

  		//Input Second Integer
		System.out.print("Input the second integer: ");
		intTwo = Scan.nextInt();

		//Input Third Integer
		System.out.print("Input the third integer: ");
		intThree = Scan.nextInt();

		//Find Two Smaller Integers
			if (intOne <= intTwo)
			{
				smlOne = intOne;

				if (intTwo <= intThree)
				{
					smlTwo = intTwo;
				}
					else
					{
						smlTwo = intThree;
					}
			}
			else
			{
				smlOne = intTwo;

				if (intOne <= intThree)
				{
					smlTwo = intOne;
				}
				else
				{
					smlTwo = intThree;
				}
			}
		//Calculate the Product
			product = smlOne * smlTwo;

		//Display the Product
			System.out.print ("\n\n\t\tThe product of the two smaller integers is: " + product);
			System.out.print ("\n\n");

	} //end main method

} //end IfElse2