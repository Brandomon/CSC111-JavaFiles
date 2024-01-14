import java.util.Scanner;

public class Loops2
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input an integer which states how
    *		many numbers to enter.  Find the average of those numbers (for loop)
    *
    * BEGIN Display Average Of Numbers
	*
    * END Display Average Of Numbers
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants

		//local variables


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

} //end Loops2