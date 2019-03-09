/**
 * 
 */
package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import com.mysql.jdbc.Statement;

/**
 * @author manu
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","manu","password");
			//Statement myStatement = myConnection.createStatement();
				java.sql.Statement myStatement = myConnection.createStatement();
//				ResultSet myResultSet = myStatement.executeQuery("Select*from Studentinfo");
//				while(myResultSet.next())
//				{
//					System.out.println(myResultSet.getString("Person_ID")+","+myResultSet.getString("Student_Name"));
//				}
				String sql="insert into SignUp(Name,UserName,Password,Email)values('Manudeep','Manu','qwerty','manu@gmail.com')";
				myStatement.execute(sql);
				System.out.println("Insertion Completed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Got an error in the database connection:" + e);
		}
	}

}
