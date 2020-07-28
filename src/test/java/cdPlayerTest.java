import org.junit.Before;
import org.junit.Test;
import stereoParts.cdPlayer;

import static org.junit.Assert.assertEquals;

public class cdPlayerTest {
    stereoParts.cdPlayer cdPlayer;
    
    @Before
    public void before(){
        cdPlayer = new cdPlayer("Panasonic", "H1", 5);
    }

    @Test
    public void hasCDs(){
        assertEquals(5, cdPlayer.getNoOfCds());
    }
}
