package com.had0uken.english.dao;




import com.had0uken.english.entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao{

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Question> getAllQuestions() {
        Session session = sessionFactory.getCurrentSession();
        List<Question> allQuestions = session.createQuery("from Question").getResultList();
        return allQuestions;
    }

    @Override
    public void saveNewQuestion(Question question) {
        Session session = sessionFactory.getCurrentSession();
        session.save(question);
    }

}
