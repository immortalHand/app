package com.app.service;

import com.app.pojo.Dev_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService{



	@Override
	public Dev_user dologin(Dev_user devuser) {
		return new Dev_user();
	}
	
	
	

}
