 /**********************************************************
 * Program Name   : Practice Coding - Users
 * Author         : Brandon LaPointe
 * Date           : 11/03/2020
 * Course/Section : CSC 111 - 304
 * Program Description: This class will manage a users
 *   login account.  It will keep track of the username
 *   and password along with the number of successful logins.
 *
 * Methods:
 * -------
 * constructor
 * login
 * toString
 **********************************************************/


public class PracticeCodingUsers
{

	//class constants

	//class variables
	private String password;		//users password is case sensitive
	private String username;		//user's username - is NOT case sensitive
	private int numLogins;			//number of successful login attempts

    /**********************************************************
    * Method Name    : Constructor
    * Author         : Brandon LaPointe
    * Date           : 11/03/2020
    * Course/Section : CSC 111 - 304
    * Program Description:
    *
    * BEGIN Constructor(user, pass)
    *    initialize the instance data
    * END Constructor
    **********************************************************/

    public PracticeCodingUsers(String user, String pass)
    {
		//local constants

		//local variables


        /********************   Start main method  *****************/

		//initialize the instance data
		username  = user;
		password  = pass;
		numLogins = 0;

	}//end constructor

    /**********************************************************
    * Method Name    : login
    * Author         :
    * Date           : April 01, 2010
    * Course/Section : CSC111 - 01
    * Program Description:
    *
    * BEGIN login (user, pass)
    * END updateGreades
    **********************************************************/

   public
   {
      //local constants

      //local variables


      /**************************************/


   }//end login

    /**********************************************************
    * Method Name    : toString
    * Author         :
    * Date           :
    * Course/Section : CSC111
    * Program Description:
    *
    * BEGIN toString
    *
    * END toString
    **********************************************************/
    public String toString()
    {
	   //local constants

	   //local variables
	   String output;		//the instance data formatted for output

	   /******************************************************/

	   //retun the instance data formatted
	   output = "\t\tUsername   : " + Util.setRight(10, username) + "\n" +
	            "\t\tPassword   : " + Util.setRight(10, password);
	   return output;

	}//end toString

} //end PracticeCodingUsers
