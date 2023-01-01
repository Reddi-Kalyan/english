package com.had0uken.english.counting;

import com.had0uken.english.enums.Level;

public interface LevelCounter {
    public Level getLevelByScore(int totalPoints, int userPoints);
}
