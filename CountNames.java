
/**********************************************************
*Description: 15)
*
*
*
*
*
*
*
***********************************************************/


import java.util.Scanner;

public class CountNames
{
	public static void main (String[] args)
	{
		//local constants
		final String QUIT = "xxx";

		//local variables
		String name;
		String concatName = "";
		Scanner scan = new Scanner(System.in);

		/*************************************************/

		//input the first value (or quit)
		System.out.print("Input name (\"xxx\" to quit): ");
		name = scan.nextLine;

		//while the name is not quit
		while (name.equalsIgnoreCase(QUIT))
		{
			//add first character to the concatenated string
			concatName += name.charAt(0);

			//input the first value (or quit)
			System.out.print("Input name (\"xxx\" to quit): ");
			name = scan.nextLine();

		}//end while

		//display the first letters concatenated into 1 string
		System.out.println("\nFirst Letters: " + concatName + "\n\n");

	}//end main

}//end CountNames