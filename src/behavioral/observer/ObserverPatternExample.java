package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject interface to be implemented by the concrete subject
interface Subject {
    void registerObserver(Observer observer); // method to register an observer
    void removeObserver(Observer observer); // method to remove an observer
    void notifyObservers(); // method to notify all observers when the subject changes
}

// Concrete subject class that implements the Subject interface
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>(); // list of registered observers
    private int state; // state of the subject

    public int getState() { // method to get the state of the subject
        return state;
    }

    public void setState(int state) { // method to set the state of the subject and notify observers of the change
        this.state = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) { // method to register an observer
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) { // method to remove an observer
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() { // method to notify all registered observers of a change in the subject
        for (Observer observer : observers) { // loop through all registered observers
            observer.update(); // notify each observer by calling its update method
        }
    }
}

// Observer interface to be implemented by the concrete observer
interface Observer {
    void update(); // method called by the subject to update the observer
}

// Concrete observer class that implements the Observer interface
class ConcreteObserver implements Observer {
    private ConcreteSubject subject; // subject being observed by the observer

    public ConcreteObserver(ConcreteSubject subject) { // constructor to set the subject being observed and register the observer
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() { // method called by the subject to update the observer
        System.out.println("Observer updated with state " + subject.getState()); // print out the observer's updated state
    }
}

// Example usage of the Observer pattern
public class ObserverPatternExample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject(); // create a new subject
        ConcreteObserver observer1 = new ConcreteObserver(subject); // create a new observer and register it with the subject
        ConcreteObserver observer2 = new ConcreteObserver(subject); // create another observer and register it with the subject
        ConcreteObserver observer3 = new ConcreteObserver(subject); // create another observer and register it with the subject

        // Change the state of the subject and notify observers
        subject.setState(1); // set the state of the subject to 1 and notify observers
        subject.setState(2); // set the state of the subject to 2 and notify observers
        subject.setState(3); // set the state of the subject to 3 and notify observers
    }
}
