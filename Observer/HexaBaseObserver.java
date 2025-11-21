
// class HexaBaseObserver {
//     -List~String~ events
//     +updateState(int state)
//     +getEvents() List<String>
// }

import java.util.*;

public class HexaBaseObserver implements NumericBaseObserver {

    private List<String> events;

    public HexaBaseObserver() {
        events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        events.add(Integer.toHexString(state));
    }

    @Override
    public List<String> getEvents() {
        return this.events;
    }

}