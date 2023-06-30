package ObserverPattern.Publisher;

import ObserverPattern.Subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observerList= new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
for(Observer observer: observerList)
{
    observer.update(temperature,humidity,pressure);
}
    }

    public void meaurementChanged()
    {
        if(observerList.size()>0) {
            System.out.println("Measurement has been changed");
        }
        else
        {
            System.out.println("no Subscriber availbable");
        }
        notifyObserver();
    }
    public void setMeasurement(float temperature, float humidity, float pressure)
    {
        this.pressure=pressure;
        this.temperature=temperature;
        this.humidity=humidity;
        meaurementChanged();
    }
}
