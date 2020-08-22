package Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MakeDBConnection {

	public static Connection connect() throws ClassNotFoundException {
		
		Connection conn = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");	//to load the driver in the memory
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
			System.out.println("Connection is successful !!!!!!!!!!!!!");
			return conn;
			
		} catch(SQLException e )	{
			System.out.println(e.getMessage());
			return null;
		}
	}

}
