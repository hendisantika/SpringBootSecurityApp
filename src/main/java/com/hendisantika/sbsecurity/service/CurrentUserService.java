/**
 * 
 */
package com.hendisantika.sbsecurity.service;

import com.hendisantika.sbsecurity.bean.CurrentUser;

/**
 * @author Dinesh.Rajput
 *
 */
public interface CurrentUserService {
	
	 boolean canAccessUser(CurrentUser currentUser, Long userId);
}
