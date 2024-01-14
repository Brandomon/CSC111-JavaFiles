import java.util.Scanner;

public class IfElse4
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input 2 integers.  If the
    * 		first number is bigger, multiply the numbers.  Otherwise, if the
    * 		2nd number is bigger, divide the first number by the second number.
    *		If the numbers are the same, add them together.
    *
    * BEGIN Determine Relation And Multiply Or Divide
    *		Input First Integer
    *		Input Second Integer
    *		Determine If First Is Larger
    *			IF (intOne > intTwo)
    *				result = intOne * intTwo
    *				IF (intOne < intTwo)
    *					result = intOne / intTwo
    *				END IF
    *			ELSE
    *				result = intOne + intTwo
    *			END IF
    * END Determine Relation And Multiply, Divide, Or Add
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants

		//local variables
		int intOne;			//First Integer Input
		int intTwo;			//Second Integer Input
		double result;		//Results Of Applied Mathematics

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/

  		//Input First Integer
  		System.out.print("Input the first integer: ");
  		intOne = Scan.nextInt();

  		//Input Second Integer
		System.out.print("Input the second integer: ");
  		intTwo = Scan.nextInt();

		//Determine Relation And Multiply, Divide, Or Add
			if (intOne > intTwo)
			{
				result = (double)intOne * intTwo;
			}
			if (intOne < intTwo)
			{
					result = (double)intOne / intTwo;
			}
			else
			{
				result = intOne + intTwo;
			}

		//Display Results
		System.out.print("\n\n\t\tThe Results Of The Given Integers Is: " + result);
		System.out.print("\n\n");

	} //end main method

} //end IfElse4