package cn.edu.jnu.x2020101328;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test20Zeros(){
        repeatedRoll(0, 20);
        assertEquals(0,game.score());
    }
    @Test
    public void test20Ones(){
        repeatedRoll(1,20);
        assertEquals(20,game.score());
    }
    @Test
    public void testASpare(){
        game.roll(7);
        game.roll(3);
        game.roll(5);
        repeatedRoll(0,17);
        assertEquals(20,game.score());
    }
    @Test
    public void testAStrike(){
        rollAStrike();
        game.roll(3);
        game.roll(4);
        repeatedRoll(0,16);
        assertEquals(24,game.score());
    }
    @Test
    public void testFullStrike(){
        repeatedRoll(10,12);
        assertEquals(300,game.score());
    }
    private void rollAStrike() {
        game.roll(10);
    }

    private void repeatedRoll(int pin, int round) {
        for(int i=0;i<round;i++){
            game.roll(pin);
            game.score();
        }
    }
}
