package cn.edu.jnu.x2020101328;

import java.util.Random;

public class WuPusGame {
    private int rooms[];
    private int score = 0;
    public int setPlayerRoom(int i) {
        score += rooms[i];
        return i;
    }

    public int initRoom(int i) {
        rooms = new int[i];
        Random random = new Random();
        for(int k=0;k<i;k++){
            rooms[k]=1;
            //rooms[k] = random.nextInt(9);
        }
        return rooms.length;
    }


    public int score() {
        return score;
    }
}
