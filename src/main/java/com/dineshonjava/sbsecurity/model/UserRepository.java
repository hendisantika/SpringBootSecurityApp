/**
 * 
 */
package com.dineshonjava.sbsecurity.model;

import org.springframework.data.repository.CrudRepository;

/**
 * @author hendisantika
 *
 */
public interface UserRepository extends CrudRepository<User, Long>{
	
	User findOneByEmail(String email);
}
