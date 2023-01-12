package com.had0uken.english.dao;

import com.had0uken.english.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    List<User> getAllUsers();
    void banUser(Integer id);
    void unBanUser(Integer id);
    Optional<User> getUserByEmail(String email);
}
