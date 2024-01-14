/**********************************************************
 * Program Name   : StudentDriver
 * Author         : Brandon LaPointe
 * Date           : 11/31/2020
 * Course/Section : CSC 111 - 304
 * Program Description: This method will
 *
 * Methods:
 * -------
 * Main - Create a driver class that will manage the whole process.
 *     The driver class only has to input student data and the echo the
 *     data back to the screen in an attractive manner. The user should
 *     be allowed to specify the maximum number of students to enter.
 *     However, the user is not required to enter that many students.
 *
 **********************************************************/

 public class StudentDriver
 {
    /**********************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 11/12/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This method will manage the student info
    *	 and display the
    *
    * BEGIN main method
    *	 Input the student info
    *	 Format full name
    *	 Instantiate a copy of the student
    *	 Display formatted student info
    *	 Input student group
    *	 Call a method to insert student
    *
    *
    * END main method
    **********************************************************/

    public static void main(String[] args)
    {
		//local constants

		//local variables
		String inNameFirst;			//First name of student input by user
		String inNameLast;			//Last name of student input by user
		String inFullName;			//Full name of student in format last name, first name
		int inAge;					//Age of student input by user
		double inGpa;				//GPA of student input by user
		String inCourseName;		//Course name input by the user
		String inSection;			//Section input by user
		StudentInfo student;		//Stored values of student info
		StudentGroup studentGroup;	//Stored values of student group info
		int inMax;					//Max number of students within section input by user
		Scanner scan = new Scanner(System.in);

        /********************   Start main method  *****************/

        //Input Student Info
        System.out.print(Util.setLeft(40,"Enter Student's First Name : "));
        inNameFirst = scan.nextLine();
        System.out.print(Util.setLeft(40,"Enter Student's Last Name  : "));
        inNameLast = scan.nextLine();
        System.out.print(Util.setLeft(40,"Enter Student's Age        : "));
        inAge = scan.nextInt();
        System.out.print(Util.setLeft(40,"Enter Student's GPA        : "));
        inGpa = scan.nextDouble();

        //Format full name
        inFullName = inNameLast + ", " + inNameFirst;

        //Instantiate a copy of the student
        student = new StudentInfo(inFullName, inAge, inGpa);

		//Display the student info
		System.out.print(student + "\n\n");

		//Input Student Group info
		System.out.print("Enter Course Name  : ");
		inCourseName = scan.nextLine();
		System.out.print("Enter Section      : ");
		inSection = scan.nextLine();

		//Input max number of students in group
		System.out.print("Enter the maximum number of students in the class : ");
		inMax = scan.nextInt();

		//Call a method to insert student
		studentGroup = new StudentGroup(inCourseName, inSection, inFullName, inMax);

		//Display student class info
		System.out.print(studentGroup + "\n\n");

	}//end main

} //end StudentDriver