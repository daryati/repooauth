package com.testbl.springoauth.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.testbl.springoauth.model.User;
import com.testbl.springoauth.repository.UserRepository;


@Service("userDetailsService")
public class UserService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findOneByUsername(username);
	}
	
	@Transactional
	public List<User> getActiveUser(){
		return userRepository.getActiveUser();
	}

}
