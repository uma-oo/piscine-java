
// class ValuePublisher {   
//     -List~NumericBaseObserver~ observers
//     +updateState(int value)
//     +subscribe(NumericBaseObserver observer)
//     +unsubscribe(NumericBaseObserver observer)
// }

import java.util.*;

public class ValuePublisher {
    private List<NumericBaseObserver> observers;

    public ValuePublisher() {
        observers = new ArrayList<>();
    }

    public void updateState(int value) {
        for (NumericBaseObserver observer : observers) {
            observer.updateState(value);
        }
    }

    public void subscribe(NumericBaseObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(NumericBaseObserver observer) {
        observers.remove(observers.indexOf(observer));
    }

}