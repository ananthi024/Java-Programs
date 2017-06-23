package com.classmiss.ClassyMissyBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserDetails {
	@Id
@GeneratedValue
	
String uname;
String password;
String cusname;
String role;
String uemail;
String uaddr;
String umobileno;
boolean enabled;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUaddr() {
	return uaddr;
}
public void setUaddr(String uaddr) {
	this.uaddr = uaddr;
}
public String getUmobileno() {
	return umobileno;
}
public void setUmobileno(String umobileno) {
	this.umobileno = umobileno;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}


}




