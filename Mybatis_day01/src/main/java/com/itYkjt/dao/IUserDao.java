package com.itYkjt.dao;

import com.itYkjt.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
