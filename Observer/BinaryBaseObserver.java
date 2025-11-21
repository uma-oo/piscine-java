
import java.util.*;;

// class BinaryBaseObserver {
//     -List~String~ events
//     +updateState(int state)
//     +getEvents() List<String>
// }

public class BinaryBaseObserver implements NumericBaseObserver {

    private List<String> events;

    public BinaryBaseObserver() {
        events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        events.add(Integer.toBinaryString(state));
    }

    @Override
    public List<String> getEvents() {
        return this.events;
    }

}