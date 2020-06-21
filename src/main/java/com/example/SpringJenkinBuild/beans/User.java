package com.example.SpringJenkinBuild.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class User {

@NotNull
private int userId;

@NotNull
@Size(min = 3, max = 8)
@Pattern(regexp = "^[A-Za-z0-9]*$")
private String userName;

@NotNull
@Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3") 
private String userPass;

User(){
	
}

public User(int userId, String userName, String userPass) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userPass = userPass;
}

public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPass() {
	return userPass;
}
public void setUserPass(String userPass) {
	this.userPass = userPass;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + "]";
}

}
