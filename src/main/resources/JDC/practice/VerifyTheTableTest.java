package JDC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class VerifyTheTableTest {
	@Test	
	 void verifythetabletest() throws Throwable 
	{
		String ExpectedData="ram";
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(" select firstname from students_info where firstname ='ram';");
		while(res.next())
		{
			String ActualData=res.getString(1);
			if(ActualData.equals(ExpectedData))
			{
				System.out.println(ExpectedData+" is present");
			}
		}
		con.close();
	}

}
