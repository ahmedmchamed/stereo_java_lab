import org.junit.Before;
import org.junit.Test;
import stereo.Stereo;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("Technics", "T12", "SuperStereo");
    }

    @Test
    public void hasRadio(){
        assertEquals("Panasonic", stereo.getRadio().getMake());
    }

    @Test
    public void canTune(){
        assertEquals("Radio ONE", stereo.getRadio().tune());
    }

    @Test
    public void hasCassetteSlots(){
        assertEquals(2, stereo.getCassettePlayer().getNoOfSlots());
    }
}
