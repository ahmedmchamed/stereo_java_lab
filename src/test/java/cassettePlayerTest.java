import org.junit.Before;
import org.junit.Test;
import stereoParts.cassettePlayer;

import static org.junit.Assert.assertEquals;

public class cassettePlayerTest {
    stereoParts.cassettePlayer cassettePlayer;

    @Before
    public void before(){
        cassettePlayer = new cassettePlayer("Sony", "md1", 2, 2);
    }

    @Test
    public void hasRewindSpeed(){
        assertEquals(2, cassettePlayer.getRewindSpeed());
    }

    @Test
    public void hasSlots(){
        assertEquals(2, cassettePlayer.getNoOfSlots());
    }
}
