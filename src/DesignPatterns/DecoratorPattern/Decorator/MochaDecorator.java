package DecoratorPattern.Decorator;

import DecoratorPattern.Client.Beverage;
import DecoratorPattern.Decorator.CondimentDecorator;

public class MochaDecorator extends CondimentDecorator {

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.99;
    }
}
