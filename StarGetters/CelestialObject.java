
public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String newName, double newX, double newY, double newZ) {
        this.x = newX;
        this.y = newY;
        this.z = newZ;
        this.name = newName;
    }

    public double getZ() {
        return this.z;
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public String getName() {
        return this.name;
    }

    public void setZ(double newZ) {
        this.z = newZ;
    }

    public void setY(double newY) {
        this.y = newY;
    }

    public void setX(double newX) {
        this.x = newX;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}