package com.cq.girl.service;

import com.cq.girl.domain.User;
import org.springframework.stereotype.Service;


public interface userService {
    /**
     * 添加用户
     * @param user
     * @return
     * @autuor 陈强
     */
   Integer addUser(User user);
}
