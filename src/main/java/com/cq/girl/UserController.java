package com.cq.girl;

import com.cq.girl.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired private UserRepository userRepository;

    @GetMapping(value ="/userList")
    public List<User> userList(){
        return userRepository.findAll();
    }

    @GetMapping(value ="/addUser")
    public String addUser(){
        User u = new User();
        u.setAge(16);
        u.setName("66");
        u.setEmail("99");
         userRepository.save(u);
         return "成功";

    };

}
