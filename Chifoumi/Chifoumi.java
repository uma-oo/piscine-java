
public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        // your code here
        ChifoumiAction chifoumi;
        switch (chifoumiAction) {
            case ROCK:
                chifoumi = chifoumiAction.SCISSOR;
                break;
            case PAPER:

                chifoumi = chifoumiAction.ROCK;
                break;
            case SCISSOR:

                chifoumi = chifoumiAction.PAPER;
                break;
        }
        return chifoumi;
    }
}