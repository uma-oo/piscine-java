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
        Star objCasted = (Star) obj;
        return super.equals(obj) && this.magnitude == objCasted.getMagnitude();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z, magnitude);
    }
}