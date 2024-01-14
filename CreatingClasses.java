 /*************************************************************
 * Program Name   : Practice Coding - Creating Classes
 * Author         : Brandon LaPointe
 * Date           : 11/12/2020
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

 public class CreatingClasses
 {
	//class constants

	//class variables
	private String name;		//Name of the student input by user
	private int count;			//Count of grades input by user
	private int total;			//Total of grades added together
	private double average;		//Average of grades input by user

    /**********************************************************
    * Method Name    : Constructor
    * Author         : Brandon LaPointe
    * Date           : 11/12/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This constructor will initialize the
    *	instance data.
    *
    * BEGIN Constructor
    *	Inititalize the instance data for the student
    * END Constructor
    **********************************************************/

    public CreatingClasses(String inName)
    {
		//local constants

		//local variables

        /***************   Start Constructor   ***************/

		//Initialize the instance data
		name = inName;
		count = 0;
		total = 0;
		average = 0;

	}//end constructor

    /**********************************************************
    * Method Name	 : updateGrades
    * Author         : Brandon LaPointe
    * Date           : 11/12/2020
    * Course/Section : CSC 111 - 304
    * Program Description:  This method will receive a grade as an integer
    *	then increment the grade count add the grade to the total of grades
    *   then calculate the new average
    *
    * BEGIN updateGrades
    *	Increment grade count
    *	Add the grade to the total
    *	Calculate the new average
    * END updateGrades
    **********************************************************/

    public void updateGrades(double grade)
    {
    	//local constants

		//local variables

		/*****************************************************/

		//Increment grade count
	    count++;

		//Add the grade to the total
		total += grade;

		//Calculate the new average
		average = (double)total / count;

    }//end update grades

    /**********************************************************
    * Method Name    : toString
    * Author         : Brandon LaPointe
    * Date           : 11/12/2020
    * Course/Section : CSC 111 - 304
    * Program Description:  This method will format the name,
    *   number of grades, the grade total, and final average for
    *   displaying on the screen. It will include a title and data
    *   labels
    *
    * BEGIN toString
    *	Output formatted data
    * END Creating Methods
    **********************************************************/

    public String toString()
    {
	    //local constants

	    //local variables
	    String output;			//Formatted data entered for student

	    DecimalFormat decFmt = new DecimalFormat("0.00");

	    /*****************************************************/

		output =  ("\n\n" + Util.setLeft(40,"Student's Name   :") + Util.setRight(20, "" + name) + "\n" +
				   		    Util.setLeft(40,"Number of Grades :") + Util.setRight(20, "" + count) + "\n" +
				   		    Util.setLeft(40,"Grade Total      :") + Util.setRight(20, "" + total) + "\n" +
				   		    Util.setLeft(40,"Final Average    :") + Util.setRight(20, "" + decFmt.format(average)));

		//return output
		return output;

	} //end toString


} //end Creating Classes