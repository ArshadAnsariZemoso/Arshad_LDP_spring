package com.springdb.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdb.bean.User;
import com.springdb.dto.UserLocationDTO;
import com.springdb.repository.UserRepository;
import com.springdb.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserLocationDTO> getAllUsersLocation() {
		return userRepository.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList()	);
	}

	@Override
	public UserLocationDTO convertEntityToDTO(User user) {
		UserLocationDTO userLocationDTO = new UserLocationDTO();
		userLocationDTO.setUserId(user.getId());
		userLocationDTO.setEmail(user.getMail());
		userLocationDTO.setPlace(user.getLocation().getPlace());
		userLocationDTO.setLongtitude(user.getLocation().getLongtitude());
		userLocationDTO.setLongtitude(user.getLocation().getLatitide());
		return userLocationDTO;
	}

}
