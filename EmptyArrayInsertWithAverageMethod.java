/**********************************************************************
* Program Name   : Array Input Using Sentinel Value
* Author         : Brandon LaPointe
* Due Date       : 11/24/2020
* Course/Section : CSC 111 - 304
* Program Description: Program will input a number of values, input by
*    the user, into an empty array and then display the values of each
*    index value within the array
*
* BEGIN Array Input Using Sentinel Value
*    Set Count = 0
*    Prompt user for array size
*    Instantiate the array
*    Input first value or quit value
*    WHILE (User did not enter the quit value)
*       Store the input in the array at position Count1
*       Increment Count by 1
* 		IF (the array has been filled)
*          Output message indicating max inputs have been reached
*          Set the Input variable to the quit value
*       ELSE //the array has not been filled
*          Prompt the user for next input value or quit value
*       END IF
*    END WHILE
*    Clear Screen
*    Display Heading
*    FOR (Each value in the array)
*       Display value on its own line
*    END FOR
* END Array Input Using Sentinel Value
*********************************************************************/

import java.util.*;
import java.text.*;

public class EmptyArrayInsertWithAverageMethod
{
	public static void main(String[] args)
	{
		//local constants

		//local variables
		int count = 0;		//Counter for data within array
		int arySize = 0;	//Size of array input by user
		int value = 0;		//Value to be stored of input by user
		double average = 0; //Calculated average of array elements
		Scanner Scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.000");

		/**************************start main program*********************/

		//Set Count = 0
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

			//Increment Count by 1
			count++;

			//IF (the array has been filled)
			if (count == arySize)
			{
				//Output message indicating max inputs have been reached
				System.out.println(Util.setLeft(41,"Error - Max inputs have been reached"));

				//Set the Input variable to the quit value
				value = -1;
			}
			//ELSE //the array has not been filled
			else	//the array has not been filled
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

		//Display Heading
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

	//Display Average
	System.out.println("\n" + Util.setLeft(45, "Average       :") + (Util.setRight(14, "" + fmt.format(average))));


	//Space and align "Press any key to continue . . . "
	System.out.print("\n\n\n\n" + Util.setLeft(45,""));

	}//end main method

    /***********************************************************
    * Method Name    : calcAvgAry
    * Author         : Brandon LaPointe
    * Date           : 11/23/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This method will calculate the average
    *	of elements in an array and return the average.
    *
    * BEGIN calcAvgAry
    *     calculate average of array
    *     return the average
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

       //calculate average of array
       for (count = 0; count < ary.length; count++)
       {
		   total += ary[count];
	   }
	   avg = total / ary.length;

       //return the average
	   return avg;

	}//end calcAvgAry

}//end EmptyArrayInsert class