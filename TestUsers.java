import java.util.Scanner;

public class TestUsers
{
	public static void main(String [] args)
	{
		//local constants

		//local variables
		Users user = new Users("efudd", "getbuggs!");
		int count = 0;

		/*************************************************/

		//call method to instantiate a users object
		user = createUsersInstance();

		//display the user
		System.out.println(user + "\n" + count);

		//attempt 3 logins
		if (localLogin(user))
			System.out.println("success");
		else
			System.out.println("TOO BAD!");

		if (localLogin(user))
			System.out.println("success");
		else
			System.out.println("TOO BAD!");

		if (localLogin(user))
			System.out.println("success");
		else
			System.out.println("TOO BAD!");

		//display the object
		System.out.print(user);

		//call method to change password
		changePass(user);

		//attempt 1 login
		if (localLogin(user))
			System.out.println("success");
		else
			System.out.println("TOO BAD!");

	}//end main
/**********************************************************************************
* Create Users Object
**********************************************************************************/
public static Users createUsersInstance()
{
		//local constants

		//local variables
		String username;
		String password;
		Scanner scan = new Scanner(System.in);

		/******************************************************/

		//input  username
		System.out.print("\n\tEnter username: ");
		username = scan.nextLine();

		//input password
		System.out.print("\n\tEnter password: ");
		password = scan.nextLine();

		//instantiate and return the instance of Users
		return new Users(username, password);

	}//end createUsersInstance
/***********************************************************************************
*
***********************************************************************************/

	public static boolean localLogin(Users obj)	//points to same object as user
	{
		//local constants

		//local variables

		/**********************************/

		return obj.login("efudd", "getbuggs!");
	}
/**********************************************************************************
* Change the password
**********************************************************************************/
public static void changePass(Users obj)
{
		//local constants

		//local variables
		String password;
		Scanner scan = new Scanner(System.in);

		/******************************************************/

		//input password
		System.out.print("\n\tEnter new password: ");
		password = scan.nextLine();

		obj.changePassword(password);
	}

}//end class TestUsers

