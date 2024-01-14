/**********************************************************
 * Program Name   : Practice Coding - Creating Methods
 * Author         : Brandon LaPointe
 * Date           : 10/28/2020
 * Course/Section : CSC 111 - 304
 * Program Description: This program will act as the driver
 *   for practice creation methods lab assignment
 *
 * Methods:
 * -------
 * Main - Formats player name and calculates average of three scores
 * titleCase     - Formats inputted name to title case
 * findAvg       - Calculates the average of the three scores
 * displayResult - Displays the formatted name and average
 **********************************************************/
import java.util.Scanner;

public class MethodsInClassPractice
{

   /**********************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 10/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: Program will have user input player's
    *    last name and three scores. Format the player's name to
    *    title case and calculate the average of the three scores
    *    before outputting the results to the screen.
    *
    * BEGIN Creating Methods
    *     Input player last name
    *     Input 3 player scores
    *     Clear screen
    *     Call method to make last name title case
    *	  Call a method to return average of the 3 numbers
    *     Call a method to display the name and largest score (centered)
    * END Creating Methods
    **********************************************************/

   public static void main (String [] args)
   {
      //local constants

      //local variables
      String last;                 //players last name entered from keyboard
      int score1, score2, score3;  //players scores entered from keyboard
      double average;              //average of player's 3 scores
      Scanner scan = new Scanner(System.in);

      /********************   Start main method  *****************/

      //input player last name
      System.out.print("\n\n\n\tEnter player last name    : ");
      last = scan.next();

      //input three scores
      System.out.print("\n\tEnter player first score  : ");
      score1 = scan.nextInt();
      System.out.print("\tEnter player second score: ");
      score2 = scan.nextInt();
      System.out.print("\tEnter player third score  : ");
      score3 = scan.nextInt();

      //clear screen
      Util.cls();

      //call method to format employee name
      last = titleCase(last);

      //call method to find average of three integers
      average = findAvg(score1, score2, score3);

      //call method to display name and average (to 2 decimal places)
      displayResult(average, last);

   }//end main

	/**********************************************************
	* Method Name    : titleCase
	* Author         : Brandon LaPointe
	* Date           : 10/27/2020
	* Course/Section : CSC 111 - 304
	* Program Description:
	*
	* BEGIN titleCase
	*    Convert first letter to upper case
	*    Convert rest of the letters to lowercase
	*    Make word title case
	*    Return title word
	* END titleCase
	**********************************************************/
	public static String titleCase(String word)
	{
		//local constants

		//local variables
		String temp;

		/******************************************************/
		//convert first letter to upper case
		temp = word.substring(0,1);
		temp = temp.toUpperCase();

		//convert rest of the letters to lowercase
		word = word.substring(1);
		word = word.toLowerCase();

		//make word title case
		word = temp + word;

		//return the title word
		return word;

	}//end titleCase

		/**********************************************************
		* Method Name    : findAvg
		* Author         : Brandon LaPointe
		* Date           : 10/28/2020
		* Course/Section : CSC 111 - 304
		* Program Description: Receives the three score inputs and
		*    calculates the average of the three scores
		*
		* BEGIN findAvg
		*	Add three scores
		*	Divide total by 3
		*	Return average
		* END findAvg
		**********************************************************/
		public static double findAvg(int score1, int score2, int score3)
		{
			//local constants
			final int DIV = 3;

			//local variables
			double total;
			double avg;

			/******************************************************/
			//add the three numbers
			total = score1 + score2 + score3;

			//calculate the average
			avg = total / DIV;

			//return the average
			return avg;

	}//end findAvg

		/**********************************************************
		* Method Name    : displayResult
		* Author         : Brandon LaPointe
		* Date           : 10/28/2020
		* Course/Section : CSC 111 - 304
		* Program Description: Displays the formatted last name and
		*    the average of the three scores
		*
		* BEGIN displayResult
		*	Output formatted name
		*	Output average
		* END displayResult
		**********************************************************/
		public static void displayResult(double average, String last)
		{
			//local constants

			//local variables

			/******************************************************/
			//Output the formatted name
			System.out.println(Util.setLeft(49, "Player: " + last));

			//Output the average
			System.out.println(Util.setLeft(48, "Average: " + average + "\n\n\n"));


	}//end displayResult


}//end MethodsInClassPractice