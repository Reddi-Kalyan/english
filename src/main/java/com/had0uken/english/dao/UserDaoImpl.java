package com.had0uken.english.dao;

import com.had0uken.english.entity.Question;
import com.had0uken.english.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> allUsers = session.createQuery("from User").getResultList();
        return allUsers;
    }

    @Override
    public void banUser(Integer id) {
        /*Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("update User set enabled=0 where username = :paramName");
        query.setParameter("paramName", name);
        query.executeUpdate();*/
    }

    @Override
    public void unBanUser(Integer id) {
       /* Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("update User set enabled=1 where username = :paramName");
        query.setParameter("paramName", name);
        query.executeUpdate();*/
    }
}
