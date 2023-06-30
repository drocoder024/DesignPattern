package ObserverPattern;

import ObserverPattern.Publisher.WeatherData;
import ObserverPattern.Subscriber.CurrentDisplay;

public class DriverMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);

        weatherData.setMeasurement(12.5f,55.4f,44.3f);
        weatherData.unregisterObserver(currentDisplay);
        weatherData.setMeasurement(12.7f,55.4f,44.7f);

        weatherData.registerObserver(currentDisplay);
        weatherData.setMeasurement(12.7f,55.4f,44.7f);

    }
}
