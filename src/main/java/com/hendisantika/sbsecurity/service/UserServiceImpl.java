/**
 * 
 */
package com.hendisantika.sbsecurity.service;

import com.hendisantika.sbsecurity.bean.UserBean;
import com.hendisantika.sbsecurity.model.User;
import com.hendisantika.sbsecurity.model.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
    UserRepository userRepository;

	@Override
	public Optional<User> getUserById(long id) {
		LOGGER.debug("Getting user={}", id);
		return userRepository.findById(id);
	}

	@Override
	public User getUserByEmail(String email) {
		LOGGER.debug("Getting user by email={}", email.replaceFirst("@.*", "@***"));
		return userRepository.findOneByEmail(email);
	}

	@Override
	public Collection<User> getAllUsers() {
		LOGGER.debug("Getting all users");
		return (Collection<User>) userRepository.findAll();
	}

	@Override
	public User create(UserBean userBean) {
		User user = new User();
		user.setUsername(userBean.getUsername());
        user.setEmail(userBean.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(userBean.getPassword()));
        user.setRole(userBean.getRole());
        return userRepository.save(user);
	}

}
