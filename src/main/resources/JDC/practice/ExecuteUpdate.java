package JDC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
	@Test
public void executeupdate() throws Throwable
{
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement stmt=con.createStatement();
		//insert the data
		int res=stmt.executeUpdate(" insert into students_info (regno, firstname, middlename, lastname) values('7', 'noor','gowda', 'h');");
		System.out.println(res);
		if(res==1)
		{
		System.out.println("Data is inserted");	
		}
		else
		{
			System.out.println("Data is not inserted");
		}
}
}
