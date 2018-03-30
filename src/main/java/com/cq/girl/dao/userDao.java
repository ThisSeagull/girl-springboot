package com.cq.girl.dao;

import com.cq.girl.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface userDao {
    /**
     * 添加用户
     * @param user
     * @return
     * @autuor 陈强
     */
  //  Integer addUser(User user);

    // 获取主键
    @Insert("INSERT INTO user(name,age) VALUES (#{name}, #{age}) ")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addUser(User user);

}
