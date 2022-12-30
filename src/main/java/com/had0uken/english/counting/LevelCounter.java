package com.had0uken.english.counting;

import com.had0uken.english.enums.Level;
import org.springframework.stereotype.Component;

@Component
public class LevelCounter {


    public Level getLevelByScore(int totalPoints, int userPoints){
        Level level = null;
        int result = 100* userPoints/totalPoints;
        if((result>=0)&&(result<=30)) level=Level.A1;
        if((result>=31)&&(result<=50)) level=Level.A2;
        if((result>=51)&&(result<=60)) level=Level.B1;
        if((result>=61)&&(result<=75)) level=Level.B2;
        if((result>=76)&&(result<=90)) level=Level.C1;
        if((result>=91)&&(result<=100)) level=Level.C1;
        return level;
    }

}
