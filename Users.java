/**********************************************************
 * Program Name   : Practice Coding - Users
 * Author         : Brandon LaPointe
 * Date           : 11/04/2020
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

public class Users
{

	//class constants

	//class variables
	private String password;		//users password is case sensitive
	private String username;		//user's username - is NOT case sensitive
	private int numLogins;			//number of successful login attempts

    /*******************************************************
    * Method Name    : Constructor
    * Author         : Brandon LaPointe
    * Date           : 11/04/2020
    * Course/Section : CSC 111 - 304
    * Program Description:
    *
    * BEGIN Constructor(user, pass)
    *    initialize the instance data
    * END Constructor
    **********************************************************/

    public Users(String user, String pass)
    {
		//local constants

		//local variables


        /********************   Start Constructor  *****************/

		//initialize the instance data
		username  = user;
		password  = pass;
		numLogins = 0;

	}//end constructor

   /**********************************************************
    * Method Name    : login
    * Author         : Brandon LaPointe
    * Date           : 11/04/2020
    * Course/Section : CSC 111 - 304
    * Program Description:
    *
    * BEGIN login (user, pass)
    * END updateGrades
    **********************************************************/

   public boolean login(String user, String pass)
   {
      //local constants

      //local variables
	  boolean success = false;			//boolean value of login success

      /**************************************/

      //If the login is successful
      if (username.equalsIgnoreCase(user) && password.equals(pass))
      {
		  //update successful logins
		  numLogins++;

		  //set success flag to true
		  success = true;
	  }

	  //return success
	  return success;


   }//end login


   /*************************************************************
   *************************************************************/
   public void changePassword(String newPass)
   {
	   password = newPass;
   }

   /**********************************************************
    * Method Name    : toString
    * Author         : Brandon LaPointe
    * Date           : 11/04/2020
    * Course/Section : CSC 111 - 304
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
	   String output;			//the instance data formatted for output

	   /******************************************************/

	   //return the instance data formatted
	   output = "\t\tUsername   : " + Util.setRight(10, username) + "\n" +
	            "\t\tPassword   : " + Util.setRight(10, password);
	   return output;

	}//end toString

} //end Users
