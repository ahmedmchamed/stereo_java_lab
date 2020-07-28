import externalDevice.mp3Player;
import org.junit.Before;
import org.junit.Test;
import stereo.Stereo;

import static org.junit.Assert.assertEquals;

public class mp3PlayerTest {
    mp3Player mp3Player;
    Stereo stereo;
    
    @Before
    public void before(){
        mp3Player = new mp3Player("Phillips", "M1");
        stereo = new Stereo("Panasonic", "WX1000", "SuperBadAssStereo");
    }
    
    @Test
    public void canConnectToStereo(){
        assertEquals("SuperBadAssStereo", mp3Player.connect(stereo));
    }
}
