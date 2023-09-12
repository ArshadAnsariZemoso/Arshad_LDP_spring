package com.springdb.service;

import java.util.List;

import com.springdb.bean.User;
import com.springdb.dto.UserLocationDTO;

public interface UserService {

	public List<UserLocationDTO> getAllUsersLocation();
	
	public UserLocationDTO convertEntityToDTO(User user);
}
