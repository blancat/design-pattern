package observer;

public interface Subject {

    void registerObserver(Observer observer);

    void notifyObserver();
}
