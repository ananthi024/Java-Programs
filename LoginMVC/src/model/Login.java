package model;
import sun.security.util.Password;
public class Login 
{
String login,password;
public String getLogin()
{
	return login;
}
public void setLogin(String login)
{
	this.login=login;
}
public String getPassword()
{
	return password;
}
public void setPassword(String password)
{
	this.password=password;
}
public boolean isValidUser()
{
	if(login.equals("NIIT")&&(password.equals("12345")))
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
