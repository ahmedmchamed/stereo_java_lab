package externalDevice;

import stereo.IConnect;
import stereo.Stereo;

public class mp3Player implements IConnect {

    private String make;
    private String model;

    public mp3Player(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String connect(Stereo stereo) {
        return stereo.getName();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
