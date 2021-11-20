package com.testbl.springoauth.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.testbl.springoauth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
	
	@Query("select a from User a where a.enabled=1")
	List<User> getActiveUser();
}

