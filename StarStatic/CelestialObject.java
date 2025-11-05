
public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150_000_000;

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

    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double distanceX = obj1.x - obj2.x;
        double distanceY = obj1.y - obj2.y;
        double distanceZ = obj1.z - obj2.z;
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2) + Math.pow(distanceZ, 2));
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        double distance = getDistanceBetween(obj1, obj2);
        return distance * KM_IN_ONE_AU;
    }
}