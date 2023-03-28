package cn.edu.jnu.x2020101328;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class HuntGameUnitTest {
    @Test
    public void testMove(){
        WuPusGame game = new WuPusGame();
        game.initRoom(9);
        game.setPlayerRoom(4);
        game.score();
        game.next();
        assertEquals(2,game.score());
    }
}