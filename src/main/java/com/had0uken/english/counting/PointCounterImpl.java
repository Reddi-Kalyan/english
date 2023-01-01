package com.had0uken.english.counting;

import com.had0uken.english.entity.Question;
import org.springframework.stereotype.Component;


//logic of counting points according to their level
@Component
public class PointCounterImpl implements PointCounter{


    public int getPoints(Question question){
        int points=0;
        if(question.getLevel().equals("A1"))points=1;
        else if(question.getLevel().equals("A2"))points=2;
        else if(question.getLevel().equals("B1"))points=3;
        else if(question.getLevel().equals("B2"))points=4;
        else if(question.getLevel().equals("C1"))points=5;
        else if(question.getLevel().equals("C2"))points=6;
        return points;
    }
}
