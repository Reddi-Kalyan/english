package com.had0uken.english.controller;


import com.had0uken.english.configuration.MyConfig;
import com.had0uken.english.entity.Question;
import com.had0uken.english.service.QuestionServiceImpl;
import com.had0uken.english.service.UserServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ContextConfiguration(classes = MyConfig.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest(MyController.class)
class MyControllerTest {

    static Question q = null;
    static List<Question> allQuestions = null;


    @BeforeAll
    public static void init(){
        q = new Question(1, "qestion_text","answer1","answer2","answer3",1,"A1","Vocabulary","text");
        allQuestions = new ArrayList<>();
        for(int i=0;i<100;i++) {
            allQuestions.add(q);
        }
    }

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private UserServiceImpl userService;

    @MockBean
    private QuestionServiceImpl questionService;



    @Test
    void showStartView() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().is(302))
                .andExpect(redirectedUrl("http://localhost/login"))
                .andDo(MockMvcResultHandlers.print());
  }

    @Test
    void showTestView() throws Exception {
        this.mockMvc.perform(get("/testStart"))
                .andDo(print())
                .andExpect(status().is(302))
                .andExpect(redirectedUrl("http://localhost/login"));

    }

    @Test
    void goToTest() throws Exception {

        //????????????????????????????????
    }

    @Test
    void receiveAnswer() throws Exception {
       /* this.mockMvc.perform(get("/receive").)
                .andDo(print());*/
    }
/*
    @Test
    void adminPage() {
    }

    @Test
    void addNewQuestions() {
    }

    @Test
    void saveNewQuestion() {
    }

    @Test
    void listOfUsers() {
    }

    @Test
    void banUser() {
    }

    @Test
    void unBanUser() {
    }*/
}