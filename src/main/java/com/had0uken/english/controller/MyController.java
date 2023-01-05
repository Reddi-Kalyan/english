package com.had0uken.english.controller;


import com.had0uken.english.counting.LevelCounter;
import com.had0uken.english.counting.PointCounter;
import com.had0uken.english.entity.Question;
import com.had0uken.english.entity.User;
import com.had0uken.english.service.QuestionService;
import com.had0uken.english.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@EnableTransactionManagement
@Controller
public class MyController {
    //Amount of questions for one test
    final static private int AMOUNT_OF_QUESTIONS = 20;

    //Service Questions from database
    @Autowired
    private QuestionService questionService;
    //Service users from database
    @Autowired
    private UserService userService;

    //Counter of points of a test
    @Autowired
    private PointCounter pointCounter;
    //Counter of english level according to a test
    @Autowired
    private LevelCounter levelCounter;
    //It contains random questions from database for test
    private List<Question> currentQuestions = new ArrayList<>();
    //starting index of question from currentQuestions list
    private int index = -1;
    //Max value of possible points of a test
    private int totalPoints = 0;
    //value of points got by user during a test
    private int userPoints = 0;

/*@GetMapping("/")
    public String getInfoForAdmins(){
        return "admin-view";
    }

    @GetMapping("/")
    public String getInfoForUsers(){
        return "user-view";
    }*/


    @RequestMapping("/")
    public String showStartView() {
        return "start-view";
    }

    @RequestMapping("/testStart")
    public String showTestView() {
        List<Question> allQuestions = questionService.getAllQuestions();

        Random random = new Random();
        totalPoints = 0;
        userPoints = 0;
        while (currentQuestions.size() < AMOUNT_OF_QUESTIONS) {
            int rand = random.nextInt(allQuestions.size());
            if (!currentQuestions.contains(allQuestions.get(rand)))
                currentQuestions.add(allQuestions.get(rand));
        }


        return "test-view";
    }

    @RequestMapping("/test")
    public String goToTest(Model model) {

        index++;
        if (index < AMOUNT_OF_QUESTIONS) {
            model.addAttribute("curQuestionAtt", currentQuestions.get(index));
            model.addAttribute("amountAtt", AMOUNT_OF_QUESTIONS);
            model.addAttribute("indexAtt", index);
            return "roll-question-view";
        } else {
            index = -1;
            currentQuestions.clear();
            model.addAttribute("totalPointsAtt", totalPoints);
            model.addAttribute("userPointsAtt", userPoints);
            model.addAttribute("levelAtt", levelCounter.getLevelByScore(totalPoints, userPoints).getLevel());
            model.addAttribute("adviceAtt", levelCounter.getLevelByScore(totalPoints, userPoints).getDescription());
            System.out.println("totalPoints" + totalPoints);
            System.out.println("userPoints" + userPoints);
            System.out.println("levelAtt" + levelCounter.getLevelByScore(totalPoints, userPoints).getLevel());
            System.out.println("adviceAtt" + levelCounter.getLevelByScore(totalPoints, userPoints).getDescription());
            return "test-final-view";
        }

    }


    @RequestMapping("/receive")
    public String receiveAnswer(@ModelAttribute("choiceAtt") Integer choice) {
        //current question
        Question theQuestion = currentQuestions.get(index);

        totalPoints += pointCounter.getPoints(theQuestion);
        if (choice == theQuestion.getCorrectAnswer()) userPoints += pointCounter.getPoints(theQuestion);

        return "redirect:/test";

    }


    @RequestMapping("/adminPage")
    public String adminPage(Model model){
        return "admin-view";
    }

    @RequestMapping("/addNewQuestions")
    public String addNewQuestions(Model model){
        Question question = new Question();
        model.addAttribute("questionAtt",question);

        return "add-questions-view";
    }


    @RequestMapping("/saveQuestion")
    public String saveNewQuestion(@ModelAttribute("questionAtt")Question question){
        questionService.saveQuestion(question);
        return "redirect:/addNewQuestions";
    }

    @RequestMapping("/listOfUsers")
    public String listOfUsers(Model model){
        List<User>allUsers = userService.getAllUsers();
        System.out.println(allUsers.get(0).getUsername());
        System.out.println(allUsers);
        model.addAttribute("allUsersAtt",allUsers);
        return "all-users-view";
    }
}
