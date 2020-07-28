import org.junit.Before;
import org.junit.Test;
import stereoParts.recordDeck;

import static org.junit.Assert.assertEquals;

public class recordDeckTest {
    recordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new recordDeck("Hitachi", "HT6", 2);
    }

    @Test
    public void hasPlaySpeed(){
        assertEquals(2, recordDeck.getPlaySpeed());
    }
}
