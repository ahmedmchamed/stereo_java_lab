package stereoParts;

public class cassettePlayer extends Component {

    private int rewindSpeed;
    private int noOfSlots;

    public cassettePlayer(String make, String model, int rewindSpeed, int noOfSlots) {
        super(make, model);
        this.rewindSpeed = rewindSpeed;
        this.noOfSlots = noOfSlots;
    }

    public int getNoOfSlots() {
        return noOfSlots;
    }

    public void setNoOfSlots(int noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public int getRewindSpeed() {
        return rewindSpeed;
    }

    public void setRewindSpeed(int rewindSpeed) {
        this.rewindSpeed = rewindSpeed;
    }
}
