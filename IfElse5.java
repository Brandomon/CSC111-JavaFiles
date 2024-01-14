import java.util.Scanner;

public class IfElse5
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/28/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will input a students’ average and
    *		display the corresponding letter grade
    *
    * BEGIN Display Letter Grade
    *		Input First Double
    *		Determine If First Is Larger
    *			IF (intOne > intTwo)
    *				result = intOne * intTwo
    *				IF (intOne < intTwo)
    *					result = intOne / intTwo
    *				END IF
    *			ELSE
    *				result = intOne + intTwo
    *			END IF
    * END Display Letter Grade
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants

		//local variables
		double average;			//Average Of Student

		Scanner Scan = new Scanner(System.in);

		/********************   Start main method   *********************/

  		//Input Student Average
  		System.out.print("Input the student's average: ");
  		average = Scan.nextFloat();

		//Determine Letter Grade
			if (average >= 0)
			{
				if (average >= 90)
				{
					System.out.print("\n\n\t\tYour Grade is an A \n\n");
				}
					else if (average >= 80 && average <= 89)
					{
						System.out.print("\n\n\t\tYour Grade is a B \n\n");
					}
						else if (average >= 70 && average <= 79)
						{
							System.out.print("\n\n\t\tYour Grade is a C \n\n");
						}
							else if (average <= 69)
							{
								System.out.print("\n\n\t\tYour Grade is an F \n\n");
							}
			}
			else
			{
				System.out.print("\n\n\t\tInvalid Grade Entered \n\n");
			}

	} //end main method

} //end IfElse5