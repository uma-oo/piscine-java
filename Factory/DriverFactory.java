
public class DriverFactory {

    public static Driver getDriver(String typeDriver) {
        switch (typeDriver) {
            case "Car":
                return new CarDriver();
            default:
                return new PlaneDriver();
        }
    }
}