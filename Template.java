 /************************************************************************
 * Program Name   : Template (Save as "Template.java")
 * Author         : Brandon LaPointe
 * Date           :
 * Course/Section : CSC 111 - 304
 * Program Description: This program will ...
 *
 * Methods:
 * -------
 * main - calculates ...
 *
 ************************************************************************/

import java.util.Scanner;

public class 2_AverageOfIntegers
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 10/09/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input positive integers until
    *	 sum of integers is larger than 30
    *
    * BEGIN Average of Positive Integers
    *     Input
    * END Average of Positive Integers
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants
		final int END_INT = 30;
		final int QUIT    = -1;

		//local variables
		int input;			//Positive integer input by user
		int total = 0;		//Total of inputs

		Scanner Scan = new Scanner(System.in);

		/*********************Start main method*************************/
		System.out.println("Enter positive integer(-1 to quit): ");
		input = Scan.nextInt;

		while (input != QUIT)
		{
			if (input >= 0)
			{
				total += input;
				if (total <= 30)
				{
					System.out.println("Enter next positive integer(-1 to quit): ");
					input = Scan.nextInt;
				}
			}
			else
			{
				System.out.println("Error: Input not positive");
			}
			System.out.print("Total: " + total);


	} //end main method

} //end 2_AverageOfIntegers
