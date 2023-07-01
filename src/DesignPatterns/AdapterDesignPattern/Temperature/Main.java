package AdapterDesignPattern.Temperature;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor= new TemperatureSensor();

        CelciusProviderAdapter celciusProviderAdapter = new CelciusProviderAdapter(temperatureSensor);
        System.out.println( celciusProviderAdapter.temperature());
    }
}
