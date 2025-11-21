
// class DecimalBaseObserver {
//     -List~String~ events
//     +updateState(int state)
//     +getEvents() List<String>
// }

import java.util.*;

public class DecimalBaseObserver implements NumericBaseObserver {

    private List<String> events;

    public DecimalBaseObserver() {
        events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        events.add(Integer.toString(state));
    }

    @Override
    public List<String> getEvents() {
        return this.events;
    }

}