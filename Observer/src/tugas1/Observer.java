package tugas1;

import java.util.ArrayList;

// Interface untuk Observer
interface Observer {
    void update(String weather);
}

// Interface untuk Observable
interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Kelas pelanggan (Observer) yang mengimplementasikan interface Observer
class Customer implements Observer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println(name + ": Cuaca saat ini - " + weather);
    }
}

// Kelas stasiun cuaca (Observable) yang mengimplementasikan interface Observable
class WeatherStation implements Observable {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private String weather;

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }
}
