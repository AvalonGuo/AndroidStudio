package cn.edu.jnu.x2020101328;

public class BowlingGame {
    private  int score[] = new int[21];
    private int currentPinIndex = 0;
    public void roll(int pin) {
        score[currentPinIndex++] = pin;
    }

    public int score() {
        int totalScore = 0;
        int index=0;
        for(int currentFrame=0;currentFrame<10;currentFrame++)
        {
            totalScore += score[index];
            if(isaStrike(index)) {
                totalScore += score[index + 2] + score[index + 1];
            }
            else if(isaSpare(index)) {
                totalScore += score[index + 2]+ score[index + 1];
                index++;
            }
            else {
                totalScore += score[index + 1];
                index++;
            }
            index++;
        }
        return totalScore;
    }

    private boolean isaStrike(int index) {
        return 10 == score[index];
    }

    private boolean isaSpare(int index) {
        return 10 == score[index] + score[index + 1];
    }
}
