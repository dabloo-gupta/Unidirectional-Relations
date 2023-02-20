package com.example.Month2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String createUser(@RequestBody()  User user){

        return userService.createUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    //Home work API
    //1. Write an API to find all the users in DB (FINDaLL): NO parameter
    //2. Please read through the general punction that jpa interface is providing
}
