/**********************************************************
 * Class Name     : PracticeUsingClasses
 * Author         : Brandon LaPointe
 * Date           : 10/14/2020
 * Course/Section : CSC 111-304
 * Program Description:
 *    Prompt the user to input a "title" that is at least 10 characters
 *    Display only the first 5 characters
 *    Display the first word
 *    Create 3 random integers between 0 and 10
 *    Find the average of the 3 numbers
 *    Find the percentage of the first number of the overall total
 *    Find result of raising the 1st number to the power of the 2nd
 *    Add 1 to the 3rd number and calculate the square root
 *    Display title centered on the screen
 *    Display all calculations. All floats should have 2 decimals
 *
 * Methods:
 * -------
 * main - Displays all calculations with floats having 2 decimals
 *
 **********************************************************/
import java.util.*;
import java.text.*;

public class PracticeUsingClasses
{
   /**********************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 10/14/2020
    * Course/Section : CSC 111-304
    * Program Description:
    *
    * BEGIN Main
    *    Prompt the user to input a "title" that is at least 10 characters
    *    Display only the first 5 characters
    *    Display the first word
    *    Create 3 random integers between 0 and 10
    *    Find the average of the 3 numbers
    *    Find the percentage of the first number of the overall total
    *    Find result of raising the 1st number to the power of the 2nd
    *    Add 1 to the 3rd number and calculate the square root
    *    Display title centered on the screen
    *    Display all calculations. All floats should have 2 decimals
    * END Main
    **********************************************************/

   public static void main (String[] args)
   {
      //local constants
	  final int MIN_CHAR  = 10;
	  final int INT_MAX   = 11;
	  final int RNDM_NUMS = 3;
	  final int PLUS_ONE  = 1;

      //local variables
      String title;			//String input by user
	  int length;			//Length of "title" string
	  int firstSpace;		//First space in string
	  int randNum1;			//First random number
	  int randNum2;			//Second random number
	  int randNum3;			//Third random number
	  double avg;			//Average of three random numbers
	  int num1Pow2;			//First number raised to the second power
	  double sqRtNum3Pls1;	//Square root of (Third random number plus 1)


	  Scanner Scan = new Scanner(System.in);
	  DecimalFormat fmt = new DecimalFormat("0.00");

      /********************   Start main method  *****************/
      //Prompt the user to input a "title" that is at least 10 characters
      System.out.println(Util.setLeft(66, "Enter a title that is at least 10 characters long: "));
      title = Scan.nextLine();
      length = title.length();
      if (length >= 10)
      {
	  //display only the first 5 characters
	     System.out.println(Util.setLeft(94,"First five characters: " + title.substring(0, 4 + 1)));

      //display the first word
		 firstSpace = title.indexOf(' ');
		 System.out.print(Util.setLeft(105, "First word: " + title.substring(0 , firstSpace) + "\n"));

 	  //Create 3 random integers between 0 and 10
 	  	 Random rand = new Random();
		 randNum1    = rand.nextInt(INT_MAX);
		 randNum2    = rand.nextInt(INT_MAX);
		 randNum3    = rand.nextInt(INT_MAX);

	  //Find the average of the 3 numbers
		 avg = (randNum1 + randNum2 + randNum3) / RNDM_NUMS;

	  //Find the percentage of the first number
		 NumberFormat prcFmt = NumberFormat.getPercentInstance();
		 prcFmt.setMinimumFractionDigits(2);

	  //Find result of raising the 1st number to the power of the 2nd
		 num1Pow2 = randNum1 * randNum1;

	  //Add 1 to the 3rd number and calculate the square root
		 sqRtNum3Pls1 = java.lang.Math.sqrt(randNum3 + PLUS_ONE);

	  //Display title centered on the screen
	  	 System.out.println(Util.setLeft(117, title));

      //Display all calculations. All floats should have 2 decimals.
         System.out.println(Util.setLeft(89, "The first random number is: " + randNum1));
         System.out.println(Util.setLeft(88, "The second random number is: " + randNum2));
         System.out.println(Util.setLeft(89, "The third random number is: " + randNum3));
         System.out.println(Util.setLeft(80, "The average of the three numbers is: " + fmt.format(avg)));
         System.out.println(Util.setLeft(78, "The percentage of the first number is: " + prcFmt.format(randNum1)));
         System.out.println(Util.setLeft(69, "The first number raised to the second power is: " + num1Pow2));
         System.out.println(Util.setLeft(70, "The square root of the first number plus 1 is: " + fmt.format(sqRtNum3Pls1)));
	  }
	  else
	  {
		  System.out.println(Util.setLeft(110, "Error: Title less than 10 characters"));
	  }
   } //end main

}//end PracticeUsingClasses




/***********************************Going Over In Class*****************************************

	//local constants
	final int NUM_RANGE = 11;

	//local variables
	String title;
	int space;  				//position of the first space in the title
	int rand1, rand2, rand3;	//3 randomly generated integers between 0 and 10
	int total;
	float avg;					//average of 3 random numbers
	float pct;					//
	int result;
	double sqrt;

	Scanner scan = new Scanner(System.in);
	Random gen = new Random();
	DecimalFormat fmt = new DecimalFormat("0.000");
	NumberFormat pctFmt = NumberFormat.getPercentInstance();

	System.out.print("Enter a title: ");
	title = scan.nextLine();

	//display only the first 5 characters
	System.out.println("First 5 characters: " + title.substring (0, 5));

	//display the first word
	space = title.indexOf(' ');
	word  = title.substring(0, space);
	System.out.println("First word: " + word);

	//display the rest of the string (Extra)
	//title = title.substring(space + 1);
	//System.out.print("Rest of string: " + title); /*Original string goes to automatic garbage collection*/

	/*Create 3 random integers between 0 and 10
	rand1 = gen.nextInt(NUM_RANGE);
	rand2 = gen.nextInt(NUM_RANGE);
	rand3 = gen.nextInt(NUM_RANGE);
	System.out.println(rand1 + "  " + rand2 + "  " + rand3 + "  ");

	//Find the average of the 3 numbers
	avg = (rand1 + rand2 + rand3) / 3.0f;
	System.out.println("Average: " + fmt.format(avg));

	//Find the percentage of the first number
	pct = (float)rand1 / total;
	System.out.println("First number %: " + pct.Fmt.format(pct));

	//Find result of raising the 1st number to the power of the 2nd
	result = (int)Math.pow(rand1, rand2);

	//Add 1 to the 3rd number and calculate the square root
	result = Math.sqrt(rand1 + rand3);
	System.out.println("Expo Result: " + fmt.format(sqrt));

	//Display title centered on the screen
	System.out.println("\n\n\n" + Util.setLeft((SCREEN_WIDTH - title.length()) / 2, title) + "\n\n\n");