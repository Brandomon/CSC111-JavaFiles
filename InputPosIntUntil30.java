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

public class InputPosIntUntil30
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 10/09/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input positive integers until
    *	 sum of integers is larger than 30
    *
    * BEGIN InputPosIntUntil30
    *
    * END InputPosIntUntil30
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants
		final int END_INT = 30;
		final int QUIT    = -1;

		//local variables
		int input = 0;		//Positive integer input by user
		int total = 0;		//Total of inputs

		Scanner Scan = new Scanner(System.in);

		/*********************Start main method*************************/
		System.out.println("Enter positive integer(-1 to quit): ");
		input = Scan.nextInt();



	} //end main method

} //end InputPosIntUntil30

/*********************************************Going Over**********************************************

public static void main(String[] args)
{
	//local constants
	final int QUIT = 30;

	//local variables
	int value;
	int total;

	Scanner scan = new Scanner(System.in);

	/******************************************

	System.out.print("Input the first number: ");
	total = scan.nextInt();

	while (total <= QUIT)
	{
		System.out.print("Input the next number: ");
		total += scan.nextInt();
	}

	System.out.println("Total = " + total);

}
