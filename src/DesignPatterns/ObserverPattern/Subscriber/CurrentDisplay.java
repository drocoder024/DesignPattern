package ObserverPattern.Subscriber;

import ObserverPattern.Publisher.WeatherData;

public class CurrentDisplay implements Display, Observer {

    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    private float lastPressure;

    public CurrentDisplay(WeatherData weatherData) {
        this.weatherData= weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current Display Board ->  "+ " last pressure  -> "+lastPressure+ " pressure -> "+pressure);
    }

    @Override
    public void update() {
        this.lastPressure= getPressure();
        this.temperature= weatherData.getTemperature();
        this.humidity= weatherData.getHumidity();
        this.pressure= weatherData.getPressure();
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
