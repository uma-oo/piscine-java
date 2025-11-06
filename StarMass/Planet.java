import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star(); 
    }

    public Planet(String name, double x, double y, double z ,Star center, int mass) {
        super(name, x, y, z, mass);
        this.centerStar = center;
    }

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star newCenter) {
        this.centerStar = newCenter;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            Planet objCasted = (Planet) obj;
            return this.centerStar.equals(objCasted.getCenterStar());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z, centerStar);
    }

    @Override
    public String toString() {
        double distance = getDistanceBetween(this, this.centerStar);
        return String.format("%s circles around %s at the %.3f AU", this.name,
                this.centerStar.name, distance);
    }

}