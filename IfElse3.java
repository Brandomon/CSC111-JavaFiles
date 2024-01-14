import java.util.Scanner;

public class IfElse3
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input an integer and determines
    *		whether the integer is within the range of 0 - 10 (inclusive).
    * 		Display a message indicating if it is in range or not in range
    *
    * BEGIN Determine Within Range
    *		Input Integer
    *		Determine If Within Range
    *			IF (intOne <= 10 && intOne >= 0)
    *				Display "The integer is within the range"
    *			ELSE
    *				Display "The integer is out of the range"
    *			END IF
    * END Determine Within Range
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants

		//local variables
		int intOne;			//Integer input to be tested

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/

  		//Input First Integer
  		System.out.print("Input the first integer: ");
  		intOne = Scan.nextInt();

		//Determine If Within The Range
			if (intOne <= 10 && intOne >= 0)
			{
				System.out.print ("\n\n\t\tThe Integer Is Within The Given Range. ");
				System.out.print ("\n\n");
			}
			else
			{
				System.out.print ("\n\n\t\tThe Integer Is Out Of The Given Range. ");
				System.out.print ("\n\n");
			}

	} //end main method

} //end IfElse3