package ObserverPattern.Publisher;

import ObserverPattern.Subscriber.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
}
