package stereoParts;

public class cdPlayer extends Component {

    private int noOfCds;

    public cdPlayer(String make, String model, int noOfCds) {
        super(make, model);
        this.noOfCds = noOfCds;
    }

    public int getNoOfCds() {
        return noOfCds;
    }

    public void setNoOfCds(int noOfCds) {
        this.noOfCds = noOfCds;
    }
}
