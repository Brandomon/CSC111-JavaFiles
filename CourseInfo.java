/*************************************************************
* Class Name     : CourseInfo
* Author         : Brandon LaPointe
* Date           : 12/07/2020
* Course/Section : CSC 111 - 304
* Program Description: This class will manage a single student's
*    information.  It will keep track of a students name,
*    number of grades, the total of all of his/her grades
*    and overall average.  The Constructor
*    will need to know only the students name.
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

public class CourseInfo
{
	//class constants

	//class variables
	private String course;				//Name of course input by user
	private String section;				//Name or number of section input by user
	private int max;					//Maximum number of students within course input by user
	private int stuCount;				//Number of students inserted into course
	private StudentInfo[] studentAry;	//Array consisting of students within the course
	Scanner scan = new Scanner(System.in);

    /**********************************************************
    * Method Name    : Constructor
    * Author         : Brandon LaPointe
    * Date           : 12/07/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This constructor will initialize the
    *	 instance data.
    *
    * BEGIN Constructor
    *	 Inititalize the instance data for the course
    * END Constructor
    **********************************************************/

    public CourseInfo(String courseName, String sectionIn, int maxStudents)
    {
		//local constants

		//local variables

        /***************   Start Constructor   ***************/

		//Initialize the instance data
		course = courseName;
		section = sectionIn;
		max = maxStudents;
		studentAry = new StudentInfo[max];
		stuCount = 0;

	}//end constructor

	/**********************************************************
	* Method Name    : insertStudent
	* Author         : Brandon LaPointe
	* Date           : 12/10/2020
	* Course/Section : CSC 111 - 304
	* Program Description:  This method will
	*
	* BEGIN insertStudent
	*	 IF course is not full
	*		 Insert student into course
	*		 Increment stuCount by 1
	*		 Set success to equal true
	*	 ELSE course is full
	*		 Set success to equal false
	*	 END IF
	*	 Return success
	* END insertStudent
    **********************************************************/

	public boolean insertStudent(StudentInfo stu)
	{
		//local constants

		//local variables
		boolean success = false;		//Indication of successful insertion of student into course

		/*****************************************************/

		//IF course is not full
		if (stuCount < max)
		{
			//Insert student into course
			studentAry[stuCount] = stu;

			//Increment stuCount by 1
			stuCount++;

			//Set success to equal true
			success = true;
		}
		//ELSE course is full
		else
		{
			//Set success to equal false
			success = false;

		} //END IF

		//Return success
		return success;

	} //END insertStudent

	/**********************************************************
	* Method Name    : isFull
	* Author         : Brandon LaPointe
	* Date           : 12/10/2020
	* Course/Section : CSC 111 - 304
	* Program Description:  This method will compare stuCount
	*	 to max and return the resulting boolean value.
	*
	* BEGIN isFull
	*	 Return stuCount equal to max
	* END isFull
	**********************************************************/

	public boolean isFull()
	{
		return stuCount == max;

	} //END isFull

    /**********************************************************
    * Method Name    : toString
    * Author         : Brandon LaPointe
    * Date           : 11/31/2020
    * Course/Section : CSC 111 - 304
    * Program Description:  This method will format the course,
    *    section, and the students within the course before
    *	 displaying them on the screen.
    *
    * BEGIN toString
    *	 Output course info
    *	 	 IF student at index of count is not equal to null
    *			 Output student within course
    *		 END IF
    *	 Return output
    * END Creating Methods
    **********************************************************/

    public String toString()
    {
	    //local constants

	    //local variables
	    String student;					//Formatted name of student
	    String output;					//Formatted data entered for user
	    int count;						//Counter for displaying students within array
	    DecimalFormat decFmt = new DecimalFormat("0.00");

	    /*****************************************************/

		//Output course info
		output =  ("\n\n\n" + Util.setLeft(37,"- - - - - - - - - - Course- - - - - - - - - -") + "\n\n" +
							Util.setLeft(37,"Course Name           :  ") + Util.setRight(20, "" + course) + "\n" +
				   		    Util.setLeft(37,"Section               :  ") + Util.setRight(20, "" + section) + "\n\n" +
				   		    Util.setLeft(37,"- - - - - - - - - -Students - - - - - - - - -") + "\n" +
				   		    Util.setLeft(37,"- - - -Name- - - - - - - - Age - - - - - GPA-"));
		for (count=0; count < max; count++)
		{
			//IF student at index of count is not equal to null
			if (studentAry[count] != null)
			{
				//Output student within course
				output += "\n" + studentAry[count];

			} //END IF

		} //END FOR

		//return output
		return output;

	} //end toString

} //END CourseInfo
