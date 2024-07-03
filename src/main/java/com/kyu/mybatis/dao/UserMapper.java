package com.kyu.mybatis.dao;

import com.kyu.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    void insert(@Param("user") User user);
    void deleteByUsername(@Param("username") String username);
    List<User> findByAddress(@Param("address") String address);
}
