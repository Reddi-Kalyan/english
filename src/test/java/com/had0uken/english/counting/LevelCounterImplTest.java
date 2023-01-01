package com.had0uken.english.counting;

import com.had0uken.english.enums.Level;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelCounterImplTest {

    private static LevelCounterImpl levelCounterImpl = null;

    private final static int totalPoints = 100;

    private static Level levelA1 = null;
    private static Level levelA2 = null;
    private static Level levelB1 = null;
    private static Level levelB2 = null;
    private static Level levelC1 = null;
    private static Level levelC2 = null;

    @BeforeAll
    public static void init(){
        levelCounterImpl = new LevelCounterImpl();
        levelA1 = Level.A1;
        levelA2 = Level.A2;
        levelB1 = Level.B1;
        levelB2 = Level.B2;
        levelC1 = Level.C1;
        levelC2 = Level.C2;
    }

    @Test
    void getLevelByScore() {
        for (int i = 0; i <= 30; i++)
            assertEquals(levelA1, levelCounterImpl.getLevelByScore(totalPoints, i));
        for (int i = 31; i <= 50; i++)
            assertEquals(levelA2, levelCounterImpl.getLevelByScore(totalPoints, i));
        for (int i = 51; i <= 60; i++)
            assertEquals(levelB1, levelCounterImpl.getLevelByScore(totalPoints, i));
        for (int i = 61; i <= 75; i++)
            assertEquals(levelB2, levelCounterImpl.getLevelByScore(totalPoints, i));
        for (int i = 76; i <= 90; i++)
            assertEquals(levelC1, levelCounterImpl.getLevelByScore(totalPoints, i));
        for (int i = 91; i <= 100; i++)
            assertEquals(levelC2, levelCounterImpl.getLevelByScore(totalPoints, i));
    }
}