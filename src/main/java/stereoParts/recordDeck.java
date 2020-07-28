package stereoParts;

public class recordDeck extends Component {

    private int playSpeed;

    public recordDeck(String make, String model, int playSpeed) {
        super(make, model);
        this.playSpeed = playSpeed;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }
}
