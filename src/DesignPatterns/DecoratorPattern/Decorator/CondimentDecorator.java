package DecoratorPattern.Decorator;

import DecoratorPattern.Client.Beverage;

public abstract class CondimentDecorator  extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
