package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.*;

public class LoginDAO 
{
	Connection conn;
	public LoginDAO()throws Exception
	{
		Class.forName("org.h2.Driver");
		conn=DriverManager.getConnection("jdbc:h2:~/test","User1","User1");
	}
	
	public boolean isValid(Login loginobj)throws Exception
	{
		PreparedStatement psmt=conn.prepareStatement("select * from MyCustomer where custid=C1002 and password=12345");
		
		psmt.setString(1,loginobj.getLogin().trim());
		psmt.setString(2, loginobj.getPassword().trim());
		
		ResultSet rs=psmt.executeQuery();
		
		if(rs.next())
			return true;
		else
			return false;
	}
}
