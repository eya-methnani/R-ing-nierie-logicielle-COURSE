
package jdbcDemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {						
			//1. Load the JDBC driver of MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Get a connection to database			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			
			//3. Create a statement
			Statement myState = myConn.createStatement();
			
			//4. Execute SQL Query
			ResultSet rs = myState.executeQuery("select * from employee");
		
			//5. Process the result set
			while (rs.next()) {
				System.out.println(rs.getInt("EmpID") + "," + rs.getString("EmpName")+","+rs.getInt("EmpAge"));
			}
			
			//6. close connection
			myConn.close();
		}		
	       catch (ClassNotFoundException ex) {
	          System.err.println("Problème de pilote");
	       }
	       catch (SQLException ex) {
	          System.err.println("Base de données non trouvée");
	       }
	}
}

