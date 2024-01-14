/*************************************************************
* Class Name     : StudentInfo
* Author         : Brandon LaPointe
* Date           : 11/31/2020
* Course/Section : CSC 111 - 304
* Program Description: This class will manage a single student's
*    information.  It will keep track of a students name, age,
*	 and grade point average.
*
* Methods:
* -------
* Constructor  : Initializes the instance data
* updateGrades : Increments count, adds new grade, and updates
*                the average
* toString     : Formats the formatted name, number of grades,
*                total, and average
*************************************************************/
import java.text.DecimalFormat;

import java.util.*;

public class StudentInfo
{
	//class constants

	//class variables
	private String fullName;		//Full name of student input by user
	private int age;				//Age of the student input by user
	private double gpa;				//Grade Point Average of the student

    /**********************************************************
    * Method Name    : Constructor
    * Author         : Brandon LaPointe
    * Date           : 11/31/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This constructor will initialize the
    *	 instance data.
    *
    * BEGIN Constructor
    *	 Inititalize the instance data for the student
    * END Constructor
    **********************************************************/

    public StudentInfo(String lastName, String firstName)
    {
		//local constants

		//local variables

        /***************   Start Constructor   ***************/

		//Initialize the instance data
		fullName = lastName + ", " + firstName;
		age = 0;
		gpa = 0.00;

	}//end constructor

    /**********************************************************
    * Method Name    : toString
    * Author         : Brandon LaPointe
    * Date           : 11/31/2020
    * Course/Section : CSC 111 - 304
    * Program Description:  This method will format the name,
    *    age, and the GPA before displaying them on the screen.
    *
    * BEGIN toString
    *	 Output student info
    *    Return output
    * END toString
    **********************************************************/

    public String toString()
    {
	    //local constants

	    //local variables
	    String student;				//Formatted name of student
	    String output;				//Formatted data entered for user

	    DecimalFormat decFmt = new DecimalFormat("0.00");

	    /*****************************************************/

		//Output student info
		output = ("\n" + Util.setLeft(37, "" + fullName) + Util.setRight(29-fullName.length(), "" + age) + Util.setRight(16, "" + decFmt.format(gpa)));

		//return output
		return output;

	} //end toString

} //end StudentInfo

