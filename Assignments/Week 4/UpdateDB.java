package abcd.dbeg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdateEg {
	//private static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static void main(String arg[])
	{
		
	try {
		
	//Load driver class
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Connect to DB server
	Connection ct = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306/sep2",
			"root", "pass@word1");
	
	
	//Prepare Statement
	PreparedStatement ps = ct.prepareStatement("UPDATE messages SET ptype =? WHERE ptype =?");
	
	// set required fields in above prepare statement	
	ps.setString(1, "I");
	ps.setString(2, "internal");
	
	//execute Prepare Statement
	int nrecs = ps.executeUpdate();
	System.out.println("Updated "+ nrecs+" I successfully");
	
	ps.setString(1, "E");
	ps.setString(2, "external");
	nrecs = ps.executeUpdate();
	
	//fetch results and display
	System.out.println("Updated "+ nrecs+" E successfully");
	
	ps.close();
	ct.close();
	}
	//handle exception
	catch (ClassNotFoundException ce) {
	System.out.println(ce.getMessage());
	ce.printStackTrace();
	}
	catch (SQLException se) {
		System.out.println(se.getMessage());
		se.printStackTrace();
		}
	finally {
	}
	}
	}
