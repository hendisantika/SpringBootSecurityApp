/**
 * 
 */
package com.hendisantika.sbsecurity.service;

import java.util.Collection;

import com.hendisantika.sbsecurity.bean.UserBean;
import com.hendisantika.sbsecurity.model.User;

/**
 * @author Dinesh.Rajput
 *
 */
public interface UserService {
	
	User getUserById(long id);

    User getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserBean userBean);
}
