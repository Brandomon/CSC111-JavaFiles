/**********************************************************
* Program Name   : ManageCourseInformation
* Author         : Brandon LaPointe
* Date           : 12/07/2020
* Course/Section : CSC 111 - 304
* Program Description: This method will manage the course information
*     The driver class will input student data and then echo the
*     data back to the screen in an attractive manner. The user will
*     be allowed to specify the maximum number of students to enter.
*     However, the user is not required to enter that many students.
*
* Methods:
* -------
* Main 	       : Creates a driver class that will manage the course
*     	 		 information. The driver class only has to input student data
*	  	 		 and the echo the data back to the screen in an attractive
*	  	 		 manner. The user should be allowed to specify the maximum
*	  	 		 number of students to enter. However, the user is not
*	  	 		 required to enter that many students.
* createCourse : Creates a course as an object asking the user to
*	 	 		 input the course name, section, and max number of students
*	 	 		 within the course.
* userMenu     : Displays a menu for the user to choose to either
*	 	 		 display the course, insert student, or quit through
*	 	 		 set constant integer values.
**********************************************************/
import java.util.Scanner;

public class ManageCourseInformation
{
    /**********************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 11/12/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This method will create a course based
    *	 on the user input and then call a method to get the user's
    *	 choice of either inserting a student, displaying the course,
    *	 or quitting the program and then execute a corresponding
    *	 method for the user's choice.
    *
    * BEGIN Manage Course Information
	*	 Call method to create a course
	* 	 Call method to get user choice (insert, display, quit)
	*	 	 WHILE (user didn’t quit)
	*		 	 IF (user chose display)
	*			 	 Display the course
	*		 	 ELSE IF (user chose insert)
	*			 	 Call method to insert students
	*		 	 ELSE
	*			 	 Display “invalid selection” error
	*		 	 END IF
	*	 	 Call method to get user choice (insert, display, quit)
	* 	 END WHILE
	* END Manage Course Information
    **********************************************************/

    public static void main(String[] args)
    {
		//local constants
		final int DISPLAY = 1;	//Constant value for menu to display course
		final int INSERT = 2;	//Constant value for menu to insert student
		final int QUIT = 3;		//Constant quit value for menu

		//local variables
		int choice;				//User choice to display course, insert student, or quit
		CourseInfo course;		//Object containing course information input by user
		Scanner scan = new Scanner(System.in);

        /********************   Start main method  *****************/

	 	//Call method to create a course
	 	course = createCourse();

	 	//Call method to get user choice (insert, display, quit)
	 	choice = userMenu();

		//WHILE (user didn’t quit)
		while(choice != QUIT)
		{
			 //IF (user chose display)
			 if(choice == DISPLAY)
			 {
				 //Display the course
				 System.out.println(course);
			 }
			 //ELSE IF (user chose insert)
			 else if(choice == INSERT)
			 {
				 //Call method to insert students
				 insertStudents(course);
			 }
			 //ELSE
			 else//User choice not a valid selection
			 {
				 //Display “invalid selection” error
				 System.out.println("\n\n\n" + Util.setLeft(37,"ERROR : Invalid selection. Enter a 1, 2, or 3"));

			 } //END IF

			 //Call method to get user choice (insert, display, quit)
			 choice = userMenu();

		 } //END WHILE

		 //Center "press any key to continue..."
		 System.out.print("\n\n\n\n\n\n" + Util.setLeft(43, ""));

	}//end main

	/**********************************************************
	* Method Name	 : createCourse
	* Author         : Brandon LaPointe
	* Date           : 12/07/2020
	* Course/Section : CSC 111 - 304
	* Program Description:  This method will create a course as
	*	 an object containing a course name, section, and the
	*	 maximum number of students within the course and then
	*	 return the course.
	*
	* BEGIN createCourse
	*	 Input Course Name
	*	 Input Section
	*	 Input Max Students
	*	 Create a Course
	*	 Return Course
	* END createCourse
	**********************************************************/

	public static CourseInfo createCourse()
	{
		//local constants

		//local variables
		String courseName;			//Name of course input by user
		String sectionIn;			//Section number or name input by user
		int maxStudents;			//User input of maximum number of students within course
		CourseInfo course;			//Course containing multiple students' information
		Scanner scan = new Scanner(System.in);

		/*****************************************************/
		//Input Course Name
		System.out.print("\n\n\n" + Util.setLeft(43,"Enter the course name            : "));
		courseName = scan.nextLine();

		//Input Section
		System.out.print(Util.setLeft(43,"Enter the section                : "));
		sectionIn = scan.nextLine();

		//Input Max Students
		System.out.print(Util.setLeft(43,"Enter the max number of students : "));
		maxStudents = scan.nextInt();

		//Clear Screen
		Util.cls();

		//Create a Course
		course = new CourseInfo(courseName, sectionIn, maxStudents);

		//Return course
		return course;

	} //end createCourse

	/**********************************************************
	* Method Name	 : userMenu
	* Author         : Brandon LaPointe
	* Date           : 12/07/2020
	* Course/Section : CSC 111 - 304
	* Program Description:  This method will display a menu for
	*	 the user to choose to either display the course, insert
	*	 student, or quit.
	*
	* BEGIN UserMenu
	*	 Display the menu
	*	 Input user selection
	*	 Return user selection
	* END UserMenu
	**********************************************************/

	public static int userMenu()
	{
		//local constants

		//local variables
		int userSelection;			//User input of menu choice (1-3)
		Scanner scan = new Scanner(System.in);

		/*****************************************************/
		System.out.print("\n\n\n" + Util.setLeft(37,"- - - - - - - - - User Menu - - - - - - - - -") + "\n" +
						 			Util.setLeft(37,"1)") + Util.setRight(43, "Display Course") + "\n" +
						 			Util.setLeft(37,"2)") + Util.setRight(43, "Insert Students") + "\n" +
						 			Util.setLeft(37,"3)") + Util.setRight(43, "Quit") + "\n" +
						 			Util.setLeft(37,"Enter your selection (1-3)") + Util.setRight(18, ": "));
		userSelection = scan.nextInt();
		Util.cls();

		return userSelection;

	}//end userMenu

	/**********************************************************
	* Method Name    : insertStudent
	* Author         : Brandon LaPointe
	* Date           : 12/07/2020
	* Course/Section : CSC 111 - 304
	* Program Description:  This method will insert a student into
	*	 the course if the course is not full and return a boolean
	*	 value indicating if the insertion of the student was a
	*	 success or failure.
	*
	* BEGIN Insert Students(course)
	*	 IF (the student list in course is not full)
	*		 Input first name (or quit)
	*		 WHILE (first name is not quit)
	*			 Input last name
	*			 Make a student object
	*		     Insert student into the list of students in course
	*			 IF (the student list in course is not full)
	*				 Input first name (or quit)
	*			 ELSE
	*				 Display “max students” message
	*				 Set first name to quit
	*			 END IF
	*		 END WHILE
	*	 END IF
	* END Insert Students

	**********************************************************/

	public static boolean insertStudents(CourseInfo course)
	{
		//local constants
		final String QUIT = "xx";	//Quit value for inputting students

		//local variables
		String first;				//First name of student input by user
		String last;				//Last name of student input by user
		StudentInfo student;		//Student object created from user input
		int count = 0;				//Counter for inserting students into course
		boolean insert = false;		//Flag to indicate success or failure of inserting student
		Scanner scan = new Scanner(System.in);

		/*****************************************************/

		//IF(the student list in course is not full)
		if (!course.isFull())
		{
			//Input first name (or quit)
			System.out.print("\n\n\n" + Util.setLeft(37,"Enter student's first name (\"xx\" to quit)   : "));
			first = scan.nextLine();

			//WHILE (first name is not quit)
			while (!first.equals(QUIT))
			{
				//Input last name
				System.out.print(Util.setLeft(37,"Enter student's last name                   : "));
				last = scan.nextLine();

				//Make a student object
				student = new StudentInfo(last, first);

				//Insert student into the list of students in course
				course.insertStudent(student);

				//IF (the student list in course is not full)
				if (!course.isFull())
				{
					//Input first name (or quit)
					System.out.print(Util.setLeft(37,"Enter student's first name (\"xx\" to quit)   : "));
					first = scan.nextLine();
				}
				//ELSE (student list in coarse is full)
				else
				{
					//Display “max students” message
					Util.cls();
					System.out.println("\n\n\n" + Util.setLeft(37,"Maximum number of students enrolled in course"));

					//Set first name to quit
					first = QUIT;
				} //END IF

			} //END WHILE

		} //END IF

		//ELSE (student list in course is full)
		else
		{
			//Display “max students” message
			Util.cls();
			System.out.println("\n\n\n" + Util.setLeft(37,"Maximum number of students enrolled in course"));
		}

		//return flag
		return insert;

	} //END InsertStudents

} //end StudentDriver