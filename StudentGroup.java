/*************************************************************
* Program Name   : Creating Arrays of Objects - StudentGroup
* Author         : Brandon LaPointe
* Date           : 11/31/2020
* Course/Section : CSC 111 - 304
* Program Description: This class will manage a students
*   overall average.  It will keep track of a students name,
*   number of grades, the total of all of his/her grades
*   and overall average.  The Constructor
*   will need to know only the students name.
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

public class StudentGroup
{
	//class constants

	//class variables
	private String courseName;				//Course name input by the user
	private String section;					//Section name input by user
	private String ary[];				//Array of students within a course and section
	private int max;						//Max number of students

    /**********************************************************
    * Method Name    : Constructor
    * Author         : Brandon LaPointe
    * Date           : 11/31/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This constructor will initialize the
    *	instance data.
    *
    * BEGIN Constructor
    *	Inititalize the instance data for the section
    * END Constructor
    **********************************************************/

    public StudentGroup(String inCourseName, String inSection, String inFullName, int inMax)
    {
		//local constants

		//local variables

        /***************   Start Constructor   ***************/

		//Initialize the instance data
		courseName = inCourseName;
		section = inSection;
		student = inFullName;
		max = inMax;
		ary = new StudentInfo[max];


	}//end constructor

	/**********************************************************
	* Method Name	 : insertStudent
	* Author         : Brandon LaPointe
	* Date           : 11/31/2020
	* Course/Section : CSC 111 - 304
	* Program Description:  This method will insert a single
	* 	student into the array and returns a boolean indicating
	*	success or failure
	*
	* BEGIN insertStudent
	*
	* END insertStudent
	**********************************************************/

	public boolean insertStudent()
	{
		//local constants

		//local variables
		boolean flag = false;			//Flag to represent if student was successfully inserted into array
		int count;						//Counter for array values
		Scanner scan = new Scanner(System.in);

		/*****************************************************/

		for (count = 0; count < max; count++)
		{
			if (ary[count] != null)
			{
				flag = false;
			}
			else //ary[count] equals null
			{
				flag = true;
				ary[count] = student;
			}
		}

		return flag;

	}//end insertStudent

	public String toString()
	{
		//local constants

		//local variables
		String output;			//Formatted data entered for user
		int count;				//Count for outputting data of array

		/*****************************************************/

		output =  ("\n\n" + Util.setLeft(40,"--Course Information--" + "\n" +
							Util.setLeft(40,"Course   : " + courseName) + "\n" +
							Util.setLeft(40,"Section  : " + section) + "\n\n" +
							Util.setLeft(40,"------Students------")));
		for (count = 0; count < max; count++)
		{
			if (ary[count] != null)
				output += ("\n" + Util.setLeft(40,"" + ary[count]));
		}

		//return output
		return output;

	} //end toString

} //end