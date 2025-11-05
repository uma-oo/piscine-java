import java.util.Objects;

public class Star extends CelestialObject {

    private double magnitude;

    public Star() {
        super();
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    public void setMagnitude(double newMagnitude) {
        this.magnitude = newMagnitude;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            Star objCasted = (Star) obj;
            return this.magnitude == objCasted.getMagnitude();
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z, magnitude);
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", this.name, this.magnitude);
    }
}