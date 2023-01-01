package com.had0uken.english.counting;

import com.had0uken.english.entity.Question;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PointCounterImplTest {

    private static PointCounterImpl pointCounterImpl = null;
    private static List<Question> list = null;
    private static Question a1 = null;
    private static Question a2 = null;
    private static Question b1 = null;
    private static Question b2 = null;
    private static Question c1 = null;
    private static Question c2 = null;


    @BeforeAll
    public static void init() {
        pointCounterImpl = new PointCounterImpl();
        list = new ArrayList<>();
        a1 = new Question();
        a2 = new Question();
        b1 = new Question();
        b2 = new Question();
        c1 = new Question();
        c2 = new Question();
        a1.setLevel("A1");
        a2.setLevel("A2");
        b1.setLevel("B1");
        b2.setLevel("B2");
        c1.setLevel("C1");
        c2.setLevel("C2");
        list.add(a1);
        list.add(a2);
        list.add(b1);
        list.add(b2);
        list.add(c1);
        list.add(c2);
    }


    @Test
    void getPoints() {
        for (int i = 0; i < list.size(); i++)
            assertEquals(i + 1, pointCounterImpl.getPoints(list.get(i)));
    }
}