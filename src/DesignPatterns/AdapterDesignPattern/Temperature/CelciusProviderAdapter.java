package AdapterDesignPattern.Temperature;

public class CelciusProviderAdapter implements TemperatureProvider{
    TemperatureSensor temperatureSensor;

    public CelciusProviderAdapter(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    @Override
    public String temperature() {
        String farenheight = temperatureSensor.temperature();
        String temp =  convert(farenheight);
        return temp;
    }

    private String convert(String farenheight) {
        return farenheight.replace("F","C");
    }
}
