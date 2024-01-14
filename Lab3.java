  /************************************************************************
 * Program Name   : Lab3 - Batting Average
 * Author         : Brandon LaPointe
 * Date           : 10/10/2020
 * Course/Section : CSC 111 - 304
 * Program Description: Create a program that will Calculate the batting average
 *    for a group of baseball players.  Batting average is calculated by dividing
 *    the number of hits by the number of at-bats (avg = totalHits / totalAtBats).
 *    For each player, input their hits and at-bats for each game.  After all games
 *    have been entered calculate and display the batting average for that player.
 *    When entering data for a particular game, if the hits exceed the at-bats then
 *    display an error message and do not use the data.  An error should not cause
 *    the program to stop. Allow the user to continue to enter data for that
 *    particular player.
 *
 * Methods:
 * -------
 * main - calculates %, items sold, and displays sales report
 *
 ************************************************************************/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 10/10/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will calculate the batting average for a
    *    group of baseball players.
    *
	* BEGIN Calc Batting Avg
	*    Init total at-bats = 0
	*    Init total hits = 0
	*    Input number of hits (or quit)
	*    WHILE (number of hits != 0)
	*       Input number of at-bats
	*       IF (numbers of hits is not bigger than number of at-bats)
	*           Add hits to total hits
	*           Add at-bats to total at-bats
	*		END IF
	*    ELSE
	*        Display error
	*    END ELSE
	*       Input number of hits (or quit)
	*    END WHILE
	*    IF (any game info was entered)
	*       Calculate the batting avg
	*       Display the batting avg
	*    END IF
	*    ELSE
	*       Display no data entered message
	*    END ELSE
	* END Calc Batting Avg
	**********************************************************/

	public static void main(String[] args)
	{
		//local constants
		final int QUIT 	= -1;

		//local variables
		int ttlAtBats = 0;		//Total number of at-bats
		int ttlHits	  = 0;		//Total number of hits
		int atBats;				//User inputted at-bats
		int hits;				//User inputted hits
		double batAvg = 0;		//Average of totals

		Scanner Scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat(".000");

		/********************   Start main method   *********************/
		//Input Number of Hits
		System.out.print("Input number of hits (-1 to quit): ");
		hits = Scan.nextInt();

		//Input Number of At-Bats
		while (hits != QUIT)
		{
			if (hits >= 0)
			{
			System.out.print("\nInput number of at-bats : ");
			atBats = Scan.nextInt();
				if (hits <= atBats)
				{
					ttlHits += hits;
					ttlAtBats += atBats;
				}
				else
				{
					System.out.print("\n\tError: Hits greater than at-bats. Try again. \n");
				}
			}
			else
			{
				System.out.print("\n\tError: Hits entered must be positive\n" );
			}
				System.out.print("\nInput number of hits (-1 to quit): ");
				hits = Scan.nextInt();
		}
		//Calculate Batting Average
		if (ttlAtBats > 0)
		{
			batAvg = (double)ttlHits / ttlAtBats;
		}
		else
		{
			System.out.print(Util.setLeft(40, "Error: No Data Entered. \n\n"));
		}
		//Display Batting Average
		System.out.print(Util.setLeft(40, "The batting average is: " + Util.setRight(5, "" + fmt.format(batAvg)+ "\n\n")));

	} //end main method

} //end Lab3
