/************************************************
* Creating Arrays of Objects
************************************************/
import java.text.DecimalFormat;
import java.Util.*;

public class StudentInfo
{
	//class constants

	//class variables
	private String firstName;	//Student's first name input by user
	private String lastName;	//Student's last name input by user
	private int age;			//Age of the student input by user
	private double gpa;			//Grade Point Average of the student

    /**********************************************************
    * Method Name    : Constructor
    * Author         : Brandon LaPointe
    * Date           : 11/31/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This constructor will initialize the
    *	instance data.
    *
    * BEGIN Constructor
    *	Inititalize the instance data for the student
    * END Constructor
    **********************************************************/

    public StudentInfo(String inNameFirst, String inNameLast)
    {
		//local constants

		//local variables

        /***************   Start Constructor   ***************/

		//Initialize the instance data
		firstName = inNameFirst;
		lastName = inNameLast;
		age = 0;
		gpa = 0.00;

	}//end constructor

    /**********************************************************
    * Method Name    : toString
    * Author         : Brandon LaPointe
    * Date           : 11/31/2020
    * Course/Section : CSC 111 - 304
    * Program Description:  This method will format the name,
    *   age, and the GPA before displaying them on the screen.
    *
    * BEGIN toString
    *	Output formatted data
    * END Creating Methods
    **********************************************************/

    public String toString()
    {
	    //local constants

	    //local variables
	    String output;			//Formatted data entered for user

	    DecimalFormat decFmt = new DecimalFormat("0.00");

	    /*****************************************************/

		output =  ("\n\n" + Util.setLeft(40,"Student's Name : " + name) + "\n" +
				   		    Util.setLeft(40,"Student's Age  : " + age) + "\n" +
				   		    Util.setLeft(40,"Student's GPA  : " + decFmt.format(gpa)));

		//return output
		return output;

	} //end toString

} //end StudentInfo

