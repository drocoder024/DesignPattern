package DecoratorPattern.Client;

public class Expresso extends Beverage {
     private String description;

    public Expresso() {
         description = "Expresso";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 10.00;
    }
}
