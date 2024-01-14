 /**********************************************************
 * Program Name   : Creating Classes Driver
 * Author         : Brandon LaPointe
 * Date           : 11/12/2020
 * Course/Section : CSC 111 - 304
 * Program Description: This method will ask the user to input
 *	 a name. The name will then be used to instantiate a copy of
 *	 the student. The user will then be asked to input a grade
 *	 which will then call a method to update the grades and ask
 *	 for another grade until the quit value is input. The method
 *	 will then display the average.
 *
 * Methods:
 * -------
 * Main - Instantiates a copy of the student manages the student's average grade
 *
 **********************************************************/
 import java.util.Scanner;

 public class CreatingClassesDriver
 {
    /**********************************************************
    * Method Name    : main
    * Author         : Brandon LaPointe
    * Date           : 11/12/2020
    * Course/Section : CSC 111 - 304
    * Program Description: This method will ask the user to input
    *	a name. The name will then be used to instantiate a copy of
    *	the student. The user will then be asked to input a grade
    *	which will then call a method to update the grades and ask
    *	for another grade until the quit value is input. The method
    *	will then display the average.
    *
    * BEGIN main method
    *    input a name
    *    instantiate a copy of a student
    *    input a grade
    *    WHILE (the grade is not Quit)
    *       call the method to update the grades
    *       input the next grade
    *    END WHILE
    *    display the student
    *
    * END main method
    **********************************************************/

    public static void main(String[] args)
    {
		//local constants
		final int QUIT = -1;		//quit value for loop

		//local variables
		String inName;				//student's name input by user
		double grade = 0;			//integer Grade input by user
		double average = 0;			//average of grades input by user
		CreatingClasses student;	//student object created by user input
		Scanner scan = new Scanner(System.in);

        /********************   Start main method  *****************/

        //input a name
        System.out.print("\n\n" + Util.setLeft(43,"Enter student's name            : "));
        inName = scan.nextLine();

        //instantiate a copy of a student
        student = new CreatingClasses(inName);

        //input a grade
        System.out.print(Util.setLeft(43,"Enter the grade(-1 to quit)     : "));
        grade = scan.nextInt();

        //WHILE (the grade is not Quit)
		while (grade != QUIT)
		{
            //Call the method to update the grades
			student.updateGrades(grade);

            //input the next grade
            System.out.print(Util.setLeft(43,"Enter the next grade(-1 to quit): "));
            grade = scan.nextInt();

        //END WHILE
		}

		//clear screen
		Util.cls();

        //Display the student
        System.out.print(student + "\n\n\n\t\t\t\t\t");

	}//end main

} //end Creating Classes Driver




