/**
 *
 */
package com.hendisantika.sbsecurity.service;

import com.hendisantika.sbsecurity.bean.UserBean;
import com.hendisantika.sbsecurity.model.User;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Dinesh.Rajput
 *
 */
public interface UserService {

    Optional<User> getUserById(long id);

    User getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserBean userBean);
}
