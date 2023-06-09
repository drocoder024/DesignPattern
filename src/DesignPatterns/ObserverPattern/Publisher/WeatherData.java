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
    observer.update();
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

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
