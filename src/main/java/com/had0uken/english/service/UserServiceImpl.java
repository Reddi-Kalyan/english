package com.had0uken.english.service;

import com.had0uken.english.dao.UserDao;
import com.had0uken.english.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void banUser(String username) {
        userDao.banUser(username);
    }

    @Transactional
    @Override
    public void unBanUser(String username) {
        userDao.unBanUser(username);
    }
}
