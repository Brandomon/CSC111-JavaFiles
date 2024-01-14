import java.util.Scanner;

public class Loops1
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input a list of positive numbers
    *		and display how many of them are between 10 and 20 (inclusive).
	*		(while loop)
    *
    * BEGIN Display Amount Of Numbers Between 10 and 20 (inclusive)
    *		Init Count = 0
    *		Input Number (or quit)
    *		WHILE (number is not quit)
    *			IF (number is in range)
    *				Add 1 to count
    *			END IF
    *				Input number (or quit)
    *		END WHILE
    *		Display Count
    * END Display Amount Of Numbers Between 10 and 20 (inclusive)
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants
		final int QUIT = -1;
		final int MAX = 20;
		final int MIN = 10;

		//local variables
		int count = 0;			//Number of values that are in the range
		int num;				//Value input by the user

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/

  		//Input Number
  		System.out.print("Enter number (-1 to quit): ");
  		num = Scan.nextInt();

  		//While
  		while (num != QUIT)
  		{
			//Check if within range
			if (num >= MIN && num <= MAX)
			{
					//add 1 to count
					count ++;
			}
				//Input Number
				System.out.print("Enter number (-1 to quit) ");
  				num = Scan.nextInt();
		}
		System.out.print("\n\n\t\tThe amount of numbers between 10 and 20 (inclusive) is : " + count + "\n\n ");

	} //end main method

} //end Loops1