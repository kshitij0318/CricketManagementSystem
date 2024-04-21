package CricketManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;


//Connect to the MySQL database
public class ConnectionProvider {

    public static Connection getConnection() {
	try {
//	    Class.forName("com.mysql.jdbc.Driver");
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ipl_statistics", "root", "guru1803");
	    return con;
	} catch (Exception e) {}
	return null;
    }
}
