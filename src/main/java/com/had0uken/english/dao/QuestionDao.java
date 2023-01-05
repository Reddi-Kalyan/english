package com.had0uken.english.dao;

import com.had0uken.english.entity.Question;

import java.util.List;

public interface QuestionDao {
    public List<Question> getAllQuestions();

    public void saveNewQuestion(Question question);

}
