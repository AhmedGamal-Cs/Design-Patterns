package DesignPatterns.Behavioral.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllSubscribers();
}
