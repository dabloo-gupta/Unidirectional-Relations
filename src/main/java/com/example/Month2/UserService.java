package com.example.Month2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
   UserRepository userRepository;
    public String createUser(User user) {
        userRepository.save(user);
        return "user added successfully";
    }

    public User getUser(int id){
        User user = userRepository.findById(id).get(); //help you find the entity by primary key

        return user;
    }




}
