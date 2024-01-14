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
*	 	 		 a set constant value.
**********************************************************/
 import java.util.Scanner;

 public class ManageCourseInformation
 {
    /**********************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 11/12/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This method will manage the student info
    *	 and display the
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
		String course;			//Name of course input by user
		int choice;				//User choice to display course, insert student, or quit
		String courseName;		//Name of course input by user
		int sectionNum;			//Section number input by user
		int maxStudents;		//User input of maximum number of students within course
		CreateCourse course;	//Object containing course information created by user input

		Scanner scan = new Scanner(System.in);

        /********************   Start main method  *****************/

	 	//Call method to create a course
	 	course = new CourseInfo();

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
				 CourseInfo.insertStudents(course);
			 }
			 //ELSE
			 else//User choice not a valid selection

				 //Display “invalid selection” error
				 System.out.println(util.setLeft(35,"ERROR : Invalid selection. Enter a 1, 2, or 3"));

			 } //END IF

			 //Call method to get user choice (insert, display, quit)
			 choice = userMenu();

		 } //END WHILE

	}//end main

	/**********************************************************
	* Method Name	 : createCourse
	* Author         : Brandon LaPointe
	* Date           : 12/07/2020
	* Course/Section : CSC 111 - 304
	* Program Description:  This method will create a course as
	*	 an object containing a course name, section, and the
	*	 maximum number of students within the course.
	*
	* BEGIN createCourse
	*	 Input Course Name
	*	 Input Section
	*	 Input Max Students
	*	 Create a Course
	*	 Return Course
	* END createCourse
	**********************************************************/

	public void createCourse()
	{
		//local constants

		//local variables
		String courseName;		//Name of course input by user
		String sectionNum;		//Section number or name input by user
		int maxStudents;		//User input of maximum number of students within course
		StudentInfo course;		//Course containing multiple student's information

		/*****************************************************/

		//Input Course Name
		System.out.print(Util.setLeft(35,"Enter the course name : "));
		courseName = scan.nextLine();

		//Input Section
		System.out.print(Util.setLeft(35,"Enter the section     : "));
		sectionNum = scan.nextLine();

		//Input Max Students
		System.out.print(Util.setLeft(35,"Enter the max number of students : "));
		maxStudents = scan.nextInt();

		//Create a Course
		course = new StudentInfo[maxStudents];

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

		public int userMenu()
		{
			//local constants

			//local variables
			int userSelection;		//User input of menu choice (1-3)
			Scanner scan = new Scanner(System.in);

			/*****************************************************/
			System.out.println(util.setLeft(50,"- - - - - UserMenu - - - - -"));
			System.out.println(util.setLeft(50,"1)            Display Course"));
			System.out.println(util.setLeft(50,"2)            Insert Student"));
			System.out.println(util.setLeft(50,"3)                      Quit"));
			System.out.print  (util.setLeft(50,"Enter your selection (1-3) : "));
			userSelection = scan.nextInt();
			util.cls();

			return userSelection;

	}//end userMenu

} //end StudentDriver