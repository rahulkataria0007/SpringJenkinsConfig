package com.example.SpringJenkinBuild.components;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.SpringJenkinBuild.beans.User;




@Component
public class UserComponent {
	

static List<User> userList= new ArrayList<>();
static String name="Rahul Kataria";
	
	 public List<User> userList(){
		 
		 userList.add(new User(1,"rahul","rahul#123"));
		 userList.add(new User(2,"payal","payal#123"));
		 userList.add(new User(3,"saggu","saggu#123"));
		 
		 return userList;
	 }
	 
	 public List<User> addUser(int id, String name, String pass){
		 userList=userList();
		 System.out.println("before adding data to list");
		 System.out.println(userList);
		 userList.add(new User(id,name,pass));
		 System.out.println("After adding data to list");
		 System.out.println(userList);
		 return userList;
	 }
	 
    public User findUserById(int id) {
    	userList=userList();
    	for(User user:userList) {
    		if(user.getUserId()==id) {
    			return user;
    		}
    	}
    	return null;
    }
    
    public User deleteUserById(int id) {
    	userList=userList();
    	return userList.remove(id);
    }
	 
    public boolean updateUser(int id,String newPass) {
    	userList=userList();
    	User user=userList.get(id);
    	user.setUserPass(newPass);
    	return userList.add(user);
    }

}
