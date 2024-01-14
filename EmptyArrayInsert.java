/**********************************************************************
*Program Name   : Array Input Using Sentinel Value
*Author         : Brandon LaPointe
*Due Date       : 11/24/2020
*Course/Section : CSC 111 - 304
*Program Description: Program will input a number of values, input by
*   the user, into an empty array.
*
*BEGIN Array Input Using Sentinel Value
*   Set Count = 0
*   Prompt user for array size
*   Instantiate the array
*   Input first value or quit value
*   WHILE (User did not enter the quit value)
*      Store the input in the array at position Count
*      Increment Count by 1
*		IF (the array has been filled)
*         Output message indicating max inputs have been reached
*         Set the Input variable to the quit value
*      ELSE //the array has not been filled
*         Prompt the user for next input value or quit value
*      END IF
*   END WHILE
*   Clear Screen
*   Display Heading
*   FOR (Each value in the array)
*      Display value on its own line
*   END FOR
*END Array Input Using Sentinel Value
*********************************************************************/

import java.util.*;

public class EmptyArrayInsert
{
	public static void main(String[] args)
	{
		//local constants

		//local variables
		int count = 0;		//Counter for data within array
		int arySize = 0;	//Size of array input by user
		int value = 0;		//Value to be stored of input by user
		Scanner Scan = new Scanner(System.in);

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
			if (ary[arySize-1] != 0)
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

		//Display Heading
		System.out.println("\n\n\n\n" + Util.setLeft(48,"The Values of the array are :\n"));

		//FOR (Each value in the array)
		for (count = 0; count < arySize; count++)
		{

			//Display value on its own line
			System.out.println(Util.setLeft(48, "Index " + (count) + "         : ") + (Util.setRight(11, "" + ary[count])));

		} //END FOR
	System.out.print("\n\n\n\n\n\t\t\t\t\t\t");
	}//end main method

}//end EmptyArrayInsert class