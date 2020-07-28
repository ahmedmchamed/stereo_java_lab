import org.junit.Before;
import org.junit.Test;
import stereoParts.Radio;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "12345");
    }

    @Test
    public void canTune(){
        assertEquals("Radio ONE", radio.tune());
    }
}
