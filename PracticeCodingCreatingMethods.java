 /**********************************************************
 * Program Name   : Practice Coding - Creating Methods
 * Author         : Brandon LaPointe
 * Date           : 11/03/2020
 * Course/Section : CSC 111 - 304
 * Program Description: This program will act as the driver
 *   for practice creation methods lab assignment
 *
 * Methods:
 * -------
 * Main - manage an application that will find the avg of 3 #s
 * formatName		//formats the name input by the user to phonebook format
 * titleCase		//converts a word to titlecase
 * calcAvg			//calculates average of three input numbers
 * dispInfo			//displays the formatted name and calculated average
 ************************************************************/
import java.util.*;
import java.text.*;

public class PracticeCodingCreatingMethods
{

    /**********************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 11/03/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will ask for an employee's first
    *	and last name and ask for 3 integers. The program will then call a method
    *	to format the employee name to phone book format. The program will
    *	then call a method to calculate and return the average of the three
    *	input integers and finally will call a method to display the name formatted
    *	to phone book format and the average formatted to 2 decimal places.
    *
    * BEGIN Creating Methods
    *     Input employee first name
	*     Input employee last name
    *     Input 3 integers
    *     Call method to format employee name to Last, First
    *     Clear screen
    *     Call a method to return the avg of the three integers
    *     Call a method to display the name and avg (2 decimal places)
    * END Creating Methods
    ***********************************************************/

   public static void main (String [] args)
   {
      //local constants

      //local variables
      String first;			//User input for employee's first name
      String last;			//User input for employee's last name
      String fullName;		//First name and last name together
      int num1;				//User input for first integer
      int num2;				//User input for second integer
      int num3;				//User input for third integer
      double average;		//Average of three input numbers

	  Scanner scan = new Scanner(System.in);

      /********************   Start main method  ****************/

      //input employee name
      System.out.print(Util.setLeft(44,"Enter employee's first name : "));
	  first = scan.nextLine();
	  System.out.print(Util.setLeft(44,"Enter employee's last name  : "));
	  last = scan.nextLine();
	  System.out.print("\n");

      //input three integers
      System.out.println(Util.setLeft(49,"Input three integers"));
      System.out.print(Util.setLeft(44,"Input the first integer     : "));
      num1 = scan.nextInt();
      System.out.print(Util.setLeft(44,"Input the second integer    : "));
      num2 = scan.nextInt();
      System.out.print(Util.setLeft(44,"Input the third integer     : "));
      num3 = scan.nextInt();

      //clear screen
      Util.cls();

      //call method to format employee name
      fullName = formatName(first, last);

      //call method to find average of three integers
      average = calcAvg(num1, num2, num3);

      //call method to display name and average (to 2 decimal places)
      dispInfo(average, fullName);

   }//end main

   	/*********************************************************
   	* Method Name    : titleCase
   	* Author         : Brandon LaPointe
   	* Date           : 10/27/2020
   	* Course/Section : CSC 111 - 304
   	* Program Description: This method will convert a word to
   	*    title case
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
   	String temp;			//Temporary string to convert word to title case

   	/*********************************************************/
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
	* Method Name    : formatName
	* Author         : Brandon LaPointe
	* Date           : 11/03/2020
	* Course/Section : CSC 111 - 304
	* Program Description:  This method will format a full name
	*    into phonebook format. In phonebook format both the first
	*    name and last name are converted to title case and then
	*    combined into: Last, First
	*
	* BEGIN formatName(first name, last name)
	*     call method to make first name title case
	*     call method to make last name title case
	*     build name using phone book format
	*     return name in phone book format
	* END formatName
	**********************************************************/
	public static String formatName(String first, String last)
	{
		//local constants

		//local variables
		String name;			//Name in phone book format

		/******************************************************/

		//call method to make first name title case
		first = titleCase(first);

		//call method to make last name title case
		last = titleCase(last);

		//build name using phone book format
		name = last + ", " + first;

		//return name in phone book format
		return name;

	}//end formatname

   /***********************************************************
    * Method Name    : calcAvg
    * Author         : Brandon LaPointe
    * Date           : 11/03/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This method will calculate the average
    *	of 3 integer parameters and return the average.
    *
    * BEGIN Calculate Average(num1, num2, num3)
    *     calculate average of 3 integer parameters
    *     return the average
    * END Calculate Average
    **********************************************************/

    public static double calcAvg(int num1, int num2, int num3)
    {
	   //local constants

	   final int DIV = 3;		//Divisor of average of the three numbers

	   //local variables

	   double total;			//Total of num1, num2 and num3
	   double avg;				//Average of the three numbers

	   /******************************************************/

       //calculate average of 3 integer parameters
       total = num1 + num2 + num3;
       avg = total / DIV;

       //return the average
	   return avg;

	}//end calcAvg

   /***********************************************************
    * Method Name    : dispInfo
    * Author         : Brandon LaPointe
    * Date           : 11/03/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This method will display the employee's
    *	full name in phone book format and the average of the three
    *	input numbers formatted to 2 decimal places.
    *
    * BEGIN Display the employee info(full name, avg)
    *     format the average to 2 decimal places
    *     display name and average on the screen
    * END Display the employee info
    **********************************************************/
    public static void dispInfo(double average, String fullName)
    {
	   //local constants

	   //local variables

	   DecimalFormat decFmt = new DecimalFormat("0.00");

	   /******************************************************/

	   //display name and average (formatted to 2 decimal places) on the screen
	   System.out.println(Util.setLeft(49, "Name      : " + fullName));
	   System.out.println(Util.setLeft(49, "Average   :      " + decFmt.format(average)));

	}//end dispInfo

} //end PracticeCodingCreatingMethods