package com.foobaracademy.morphia;

import java.util.List;

import org.bson.types.ObjectId;


/**
 * Our own Data Access Object interface for the User entity.
 * @author Alex
 *
 */
public interface UserDAO {

	public boolean store(User user);
	
	/**
	 * get a user using its first name and last name
	 * 
	 * (note: don't do this in the real world as 
	 * multiple users might have the 
	 * same first name and last name ... :)
	 *  
	 * @return
	 */
	public User getByFirstNameLastName(String firstName, String lastName);
	
	/**
	 * get a list of users by firstName
	 * @return
	 */
	public List<User> getByFirstName(String firstName);
	
}
