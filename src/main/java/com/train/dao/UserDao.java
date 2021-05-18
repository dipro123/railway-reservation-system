/**
 * 
 */
package com.train.dao;

import java.util.List;

import com.train.model.User;

/**
 * @author SumeetK
 *
 */

public interface UserDao {
	
	// Method to add user
	public User addUser(User user);
	
	// Method to update user
	public User updateUser(User user);
	
	// Method to get tasks list from the database
	public List<User> getUsers();
	
	// Method to get user
	public User getUser(int l);
	
	public void deleteUser(int id);

}
