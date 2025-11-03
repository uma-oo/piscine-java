
public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        // your code here
        ChifoumiAction chifoumi = chifoumiAction.PAPER;
        switch (chifoumiAction) {
            case ROCK:
                chifoumi = chifoumiAction.SCISSOR;
                break;
            case PAPER:
                chifoumi = chifoumiAction.ROCK;
                break;
            case SCISSOR:
                break;
        }
        return chifoumi;
    }
}