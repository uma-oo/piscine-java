
public class Excalibur {

    private String name;
    private static Excalibur INSTANCE;

    private Excalibur(String name) {
        this.name = name;
    };

    private static class Holder {
        private static final Excalibur INS = new Excalibur("Sword");
    }

    public String getName() {
        return this.name;
    }

    public static Excalibur getInstance() {
        INSTANCE = Holder.INS;

        return INSTANCE;
    }

}
