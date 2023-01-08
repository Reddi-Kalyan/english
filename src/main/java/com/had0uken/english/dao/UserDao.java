package com.had0uken.english.dao;

import com.had0uken.english.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void banUser(Integer id);
    void unBanUser(Integer id);
}
