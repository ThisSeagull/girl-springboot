package com.cq.girl.service.Impl;

import com.cq.girl.dao.userDao;
import com.cq.girl.domain.User;
import com.cq.girl.service.userService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;



public class userServiceImpl implements userService,Serializable {

     private userDao userDao;


    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }
}
