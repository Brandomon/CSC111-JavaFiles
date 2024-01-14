 /************************************************************************
 * Program Name   : Lab1 - Insect Population Growth
 * Author         : Brandon LaPointe
 * Date           : 9/19/2020
 * Course/Section : CSC 111 - 304
 * Program Description: This program will calculate the percentage of
 *     growth for an insect colony.  First, input the initial population
 *     and then the population after 1 year.  Then determine the estimated
 *     population for year 2 and year 3. For example, if the initial population
 *     is 5, and the year 1 population is 10, then the rate of growth would be
 *     100%.  Year 2 population would be 20 and year 3 would be 40. Display
 *     the population for each year and the rate of growth as a percentage.
 *
 * Methods:
 * -------
 * main - calculates estimated insect populations
 *
 ************************************************************************/

import java.util.Scanner;
																	import java.text.DecimalFormat;

public class Lab1DecimalCenter
{
    /********************************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 9/19/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This program will calculate the percentage
    *     of growth for an insect colony.  First, input the initial population
    *     and then the population after 1 year.  Then determine the estimated
    *     population for year 2 and year 3.
    *
    *
    * BEGIN Calc Estimated Insect Growth
    *     Input the initial pop
    *     Input year 1 pop
    *     Clear the screen
    *     Calc rate of growth
    *     Calculate the % of growth
    *     Calculate est pop for Year 2
    *     Calculate est pop for Year 3
    *     Output population report
    * END Calc Estimated Insect Growth
    *********************************************************************/

	public static void main(String[] args)
	{
		//local constants

		//local variables
		int initialPop;         //initial population of the insect colony
		float year1Pop;         //population after 1 year of growth
		float year2Pop;         //population after 2 years of growth
		float year3Pop;         //population after 3 years of growth
		float growthRate;       //rate of growth from initial pop to year 1 pop
		float percentGrowth;    //percent of growth from initial pop to year 1 pop

		Scanner Scan = new Scanner(System.in);
														DecimalFormat fmt = new DecimalFormat("0.00");

		/********************   Start main method   *********************/
		//Input the initial pop
		System.out.print("\n\n\t\tInput Initial Population: ");
		initialPop = Scan.nextInt();

		//Input year 1 pop
		System.out.print("\n\n\t\tInput Year 1 Population: " );
		year1Pop = Scan.nextInt();

		/*Clear the screen - I tried multiple methods like System.out.print("\033[H\033[2J");
		System.out.flush(); and */

		//Calculate rate of growth
		growthRate = ((year1Pop - initialPop) / initialPop);

		//Calculate the % of growth
		percentGrowth = (growthRate * 100);

		//Calculate est pop for Year 2
		year2Pop = (year1Pop * growthRate + year1Pop);
		year2Pop = Math.round(year2Pop);

    	//Calculate est pop for Year 3
		year3Pop = (year2Pop * growthRate + year2Pop);
		year3Pop = Math.round(year3Pop);

    	//Output population report
    	System.out.print(Util.setLeft(51, "The estimated population is: ") + Util.setRight(6, "" + year2Pop) + " for year 2. " +
    	                (Util.setLeft(51, "The estimated population is: ") + Util.setRight(6, "" + year3Pop) + " for year 3. " +
		                (Util.setLeft(51, "The estimated population growth is: " + fmt.format(percentGrowth) + "% per year. \n\n\n\n");

	} //end main method

} //end Lab01DecimalCenter
