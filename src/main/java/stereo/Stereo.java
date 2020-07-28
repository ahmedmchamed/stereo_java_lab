package stereo;

import stereoParts.*;

public class Stereo extends Component {

    private String name;
    private Radio radio;
    private cdPlayer cdPlayer;
    private recordDeck recordDeck;
    private cassettePlayer cassettePlayer;

    public Stereo(String make, String model, String name) {
        super(make, model);
        this.name = name;
        radio = new Radio("Panasonic", "12345");
        cdPlayer = new cdPlayer("Sony", "s1", 2);
        recordDeck = new recordDeck("Hitachi", "deck5", 5);
        cassettePlayer = new cassettePlayer("Sharp", "cassette20", 10, 2);
    }

    public String getName() {
        return this.name;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public cdPlayer getCdPlayer() {
        return this.cdPlayer;
    }

    public recordDeck getRecordDeck() {
        return recordDeck;
    }

    public cassettePlayer getCassettePlayer() {
        return cassettePlayer;
    }
}
