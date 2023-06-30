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
    public void update() {
        this.temperature=getTemperature();
        this.humidity=getHumidity();
        this.pressure=getPressure();
        display();

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
