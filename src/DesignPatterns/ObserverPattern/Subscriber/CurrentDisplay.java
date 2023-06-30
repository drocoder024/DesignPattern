package ObserverPattern.Subscriber;

import ObserverPattern.Publisher.WeatherData;

public class CurrentDisplay implements Display, Observer {

    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current Display Board ->  "+ " temperature -> "+temperature+ " pressure -> "+pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();

    }
}
