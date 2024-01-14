/**********************************************************************
* Program Name   : Array Input Using Sentinel Value
* Author         : Brandon LaPointe
* Due Date       : 11/24/2020
* Course/Section : CSC 111 - 304
* Program Description: Program will input a number of values, input by
*    the user, into an empty array and then call methods to calculate the
*    average of the array and the largest and smallest values of the array.
*	 The program will then display the values of each index value within the
*    array and will display the average, largest, and smallest values of the
*	 array.
*
* BEGIN Array Input Using Sentinel Value
*    Set Count = 0
*    Prompt user for array size
*    Instantiate the array
*    Input first value or quit value
*    WHILE (User did not enter the quit value)
*       Store the input in the array at position Count
*       Increment Count by 1
* 		IF (the array has been filled)
*          Output message indicating max inputs have been reached
*          Set the Input variable to the quit value
*       ELSE //the array has not been filled
*          Prompt the user for next input value or quit value
*       END IF
*    END WHILE
*    Clear Screen
*    Call method to calculate average
*    Call method to calculate largest
*    Call method to calculate smallest
*    Display Heading
*    FOR (Each value in the array)
*       Display value on its own line
*    END FOR
*	 Display average
*	 Display largest
*	 Display smallest
* END Array Input Using Sentinel Value
*********************************************************************/

import java.util.*;
import java.text.*;

public class EmptyArrayInsertWithMethods
{
	public static void main(String[] args)
	{
		//Local Constants

		//Local Variables
		int count = 0;		//Counter for data within array
		int arySize = 0;	//Size of array input by user
		int value = 0;		//Value to be stored of input by user
		double average = 0; //Calculated average of array elements
		int largest = 0;	//Largest of the array elements
		int smallest = 0;	//Smallest of the array elements
		Scanner Scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.000");

		/**************************start main program*********************/

		//Set count = 0
		count = 0;

		//Prompt user for array size
		System.out.print("\n\n\n\n" + Util.setLeft(41,"Input the array size               : "));
		arySize = Scan.nextInt();

		//Instantiate the array
		int[] ary = new int[arySize];

		//Input first value or quit value
		System.out.print(Util.setLeft(41,"Enter the first value (-1 to quit) : "));
		value = Scan.nextInt();

		//WHILE (User did not enter the quit value)
		while (value != -1)
		{
			//Store the input in the array at position Count
			ary[count] = value;

			//Increment count by 1
			count++;

			//IF (the array has been filled)
			if (count == arySize)
			{
				//Output message indicating max inputs have been reached
				System.out.println(Util.setLeft(41,"Error - Max inputs have been reached"));

				//Set the input variable to the quit value
				value = -1;
			}
			//ELSE //the array has not been filled
			else   //the array has not been filled
			{
				//Prompt the user for next input value or quit value
				System.out.print(Util.setLeft(41, "Enter the next value  (-1 to quit) : "));
				value = Scan.nextInt();

			} //END IF

		} //END WHILE

		//Clear Screen
		Util.cls();

		//Call method to calculate average
		average = calcAvgAry(ary);

		//Call method to calculate largest
		largest = calcMaxAry(ary);

		//Call method to calculate smallest
		smallest = calcMinAry(ary);

		//Display heading
		System.out.println("\n\n\n\n" + Util.setLeft(45,"The Values of the array are :\n"));

		//FOR (Each value in the array)
		for (count = 0; count < arySize; count++)
		{

			//Display value on its own line (Extra space removed for indexes of 2 digits. Stays aligned up to index 99)
			if (count < 10)
			System.out.println(Util.setLeft(45, "Index " + (count) + "       :") + (Util.setRight(14, "" + ary[count])));
			else
			System.out.println(Util.setLeft(45, "Index " + (count) + "      :") + (Util.setRight(14, "" + ary[count])));

		} //END FOR

	//Display average
	System.out.println("\n" + Util.setLeft(45, "Average       :") + (Util.setRight(14, "" + fmt.format(average))));

	//Display largest
	System.out.println("\n" + Util.setLeft(45, "Largest       :") + (Util.setRight(14, "" + largest)));

	//Display smallest
	System.out.println(Util.setLeft(45, "Smallest      :") + (Util.setRight(14, "" + smallest)));

	//Space and align "Press any key to continue . . . "
	System.out.print("\n\n\n\n" + Util.setLeft(45,""));

	}//End main method

    /***********************************************************
    * Method Name    : calcAvgAry
    * Author         : Brandon LaPointe
    * Date           : 11/23/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This method will calculate the average
    *    of elements in an array and return the average.
    *
    * BEGIN calcAvgAry
    *    calculate average of array
    *    return the average
    * END calcAvgAry
    **********************************************************/

    public static double calcAvgAry(int[] ary)
    {
	   //local constants

	   //local variables
	   int count = 0;			//Count for the array indexes
	   double total = 0;		//Total of array elements
	   double avg = 0;			//Average of the three numbers

	   /******************************************************/

       //Calculate average of array
       for (count = 0; count < ary.length; count++)
       {
		   total += ary[count];
	   }
	   avg = total / ary.length;

       //Return the average
	   return avg;

	}//End calcAvgAry

	/***********************************************************
	* Method Name    : calcMaxAry
	* Author         : Brandon LaPointe
	* Date           : 11/23/2020
	* Course/Section : CSC 111 - 304
	* Program Description: This method will calculate the maximum
	*    and minimum value elements in an array and return the min
	*    and max.
	*
	* BEGIN calcMaxAry
	*     calculate maximum
	*     return largest
	* END calcMaxAry
	**********************************************************/

	public static int calcMaxAry(int[] ary)
	{
	   //local constants

	   //local variables
	   int count = 0;			//Count for the array indexes
	   int large = 0;			//Largest of array elements

	   /******************************************************/

	   //Calculate maximum
	   large = ary[0];
	   for (count = 1; count < ary.length; count++)
	   {
		   if (ary[count] >= large)
		      large = ary[count];
	   }

		//Return largest
		return large;

	}//End calcMaxAry

	/***********************************************************
	* Method Name    : calcMaxAry
	* Author         : Brandon LaPointe
	* Date           : 11/23/2020
	* Course/Section : CSC 111 - 304
	* Program Description: This method will calculate the minimum
	*    value of elements in an array and return the largest value
	*
	* BEGIN calcMinAry
	*     calculate minimum
	*     return smallest
	* END calcMinAry
	**********************************************************/

	public static int calcMinAry(int[] ary)
	{
	   //local constants

	   //local variables
	   int count = 0;			//Count for the array indexes
	   int small = 0;			//Smallest of array elements

	   /******************************************************/

	   //Calculate minimum
	   small = ary[0];
	   for (count = 1; count < ary.length; count++)
	   {
		   if (ary[count] <= small)
		       small = ary[count];
	   }

		//Return largest
		return small;

	}//End calcMinAry

}//End EmptyArrayInsertWithMethods