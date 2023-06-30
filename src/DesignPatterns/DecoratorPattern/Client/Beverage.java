package DecoratorPattern.Client;

public abstract class Beverage {

  private String description="unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();



}
