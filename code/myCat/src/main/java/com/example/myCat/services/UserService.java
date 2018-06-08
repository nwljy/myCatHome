package com.example.myCat.services;

import com.example.myCat.daos.UserRepository;
import com.example.myCat.entities.EUser;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<EUser> query(EUser conditon) {
		List<EUser> users = new ArrayList();
		if (conditon != null) {
			users = this.userRepository.findAll(Example.of(conditon));
		}

		return users;
	}
}
