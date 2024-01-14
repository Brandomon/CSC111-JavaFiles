/************************************************************************
 * Program Name   : IfElse1
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

public class IfElse1
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input 2 integers and display them in descending order
    *
    * BEGIN Display Descending Integers
    *		Input First Int
    *		Input Second Int
    *		Order Numbers In Descending Order
    *			IF (numOne is less than numTwo)
    *				Display numTwo, numOne
    *			END IF
    *				ELSE
    *					Display numOne, numTwo
    *				END IF
    * END Display Descending Integers
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
		if (numOne < numTwo)
		{
				System.out.print("The integers in descending order is :" + numTwo + ", " + numOne);
		}
		else
		{
				System.out.print("The integers in descending order are: " + numOne + ", " + numTwo + "\n");
		}
	} //end main method

} //end IfElse1
