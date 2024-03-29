package com.uidai.user.service;

import java.util.List;

import com.uidai.user.pojo.PageDto;
import com.uidai.user.pojo.User;
/**
 * This is Service Rules or method to perform some operation 
 * @author Rituraj
 *
 */
public interface UserService {
		/**
		 * method used to save the data in Database 
		 * 
		 * @param user
		 * @return Integer
		 */
		public Integer saveUserEntity(User user);
		
		/**
		 *this method used to get all user data from database 
		 * @return List of Users object
		 */
		public List<User>  getAllUser();
		/**
		 * this Method is used to delete the record from database 
		 * it is  perform  hard deletion
		 * 
		 * @param userId
		 */
		public void deleteUserByid(Integer userId);
		/**
		 * This method is used to get One user data based on his primary key
		 * 
		 * @param userId
		 * @return User
		 */
		public User findUserById(Integer userId);
		/**
		 * this mehtod is used to updated the user data in database
		 * @param user
		 * @return User
		 */
		public User UpdateUser(User user);
		/**
		 * this method is used perform server side pagination 
		 * to get record based on page size
		 * 
		 * @param currPage
		 * @param pageSize
		 * @return PageDto
		 */
		public PageDto  serverSidepagination(Integer currPage,Integer pageSize);
		
}
