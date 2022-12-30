package com.had0uken.english.service;

import com.had0uken.english.dao.QuestionDao;
import com.had0uken.english.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    QuestionDao questionDao;
    @Transactional
    @Override
    public List<Question> getAllQuestions() {
        return questionDao.getAllQuestions();
    }
}
