 /************************************************************************
 * Program Name   : LoopsHW2
 * Author         : Brandon LaPointe
 * Date           : 10/11/2020
 * Course/Section : CSC 111 - 304
 * Program Description: This program will input positive integers and
 * 	  display the average.
 *
 * Methods:
 * -------
 * main - calculates average of positive integers and displays the average
 *
 ************************************************************************/

import java.util.Scanner;

public class LoopsHW2
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 10/11/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input positive integers and
    *	 display the average.
    *
    * BEGIN Average of Positive Integers
    *	Init count = 0
    * 	Init total = 0
    * 	Init avg = 0
    *   Input First positive integer
    * 		WHILE (input doesn't equal QUIT)
    * 			IF (Input is greater than or equal to 0)
    *		 		Add input to total
    * 				Add 1 to count
    * 				Ask for next input
    * 			END IF
    * 			ELSE
    * 				Display error message
    * 			END ELSE
    *		END WHILE
    * 		IF (total is greater than 0)
    *			Calculate the average
    *		END IF
    *	 	ELSE
    *			Average is 0
    *		END ELSE
    *		Display the average
    * END Average of Positive Integers
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants
		final int QUIT = -1;

		//local variables
		int input;			//Input of user
		int count = 0;		//Count to divide total by
		int total = 0;		//Total of inputs
		double avg = 0;		//Average of inputs

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/
		//Input Positive Integer
		System.out.print("Enter the first positive integer (-1 to quit): ");
		input = Scan.nextInt();

		//Input Next Integer
		while (input != QUIT)
		{
			if (input >= 0)
			{
				total = total + input;
				count ++;
				System.out.print("Enter the next positive integer (-1 to quit): ");
				input = Scan.nextInt();
			}
			else
			{
				System.out.print("\n\tInput Error. Try Again. \n\n");
				System.out.print("Enter a positive integer (-1 to quit): ");
				input = Scan.nextInt();
			}
		}

		//Calculate Average
		if (total > 0)
		{
			avg = (double)total / count;
		}
		else
		{
			avg = 0;
		}
		//Display Average
		System.out.print("\n\n\t\tThe average is: " + avg + "\n\n");


	} //end main method

} //end LoopsHW2
