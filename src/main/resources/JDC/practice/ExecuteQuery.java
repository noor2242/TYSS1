package JDC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;




public class ExecuteQuery {
	@Test
	public void executequerytest() throws Throwable
	{
		//Register the DataBase
		Driver dref = new Driver();
		DriverManager.registerDriver(dref);
		//connect to the database
	Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	//create statement
	Statement stmt= con.createStatement();
	//execute my query and will get the data
	ResultSet res=stmt.executeQuery(" select *from students_info;");
	while(res.next())
	{
		System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
		
	}
	//close the connection
	con.close();
	}

}
