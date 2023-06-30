package DecoratorPattern.Client;

public class Capachino extends Beverage{

    private String description;
    public Capachino() {
        description= "Capachino";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 20;
    }
}
