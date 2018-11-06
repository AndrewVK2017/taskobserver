import java.util.ArrayList;
import java.util.List;

public class Logger implements Subject {
    private List<Observer> observers;
    private String event;

    public Logger() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void regObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void setEvent(String event) {
        this.event = event;
        notifyObserver();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getEvent() {
        return event;
    }
}
