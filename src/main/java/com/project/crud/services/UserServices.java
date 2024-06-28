package com.project.crud.services;

import com.project.crud.repository.UserRepository;
import com.project.crud.services.business.UserServicesBUSINESS;
import com.project.crud.services.crud.UserServicesCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserServicesBUSINESS userServicesBUSINESS;

    @Autowired
    private UserServicesCRUD userServicesCRUD;

}
