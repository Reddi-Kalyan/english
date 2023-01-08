package com.had0uken.english.service;

import com.had0uken.english.entity.User;

import java.util.List;

public interface UserService {
     List<User> getAllUsers();
     void banUser(Integer username);
     void unBanUser(Integer username);

}
