package DecoratorPattern.Decorator;

import DecoratorPattern.Client.Beverage;
import DecoratorPattern.Decorator.CondimentDecorator;

import static DecoratorPattern.Client.Beverage.SIZE.medium;
import static DecoratorPattern.Client.Beverage.SIZE.small;

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
        if(beverage.getSize()== small)
        {
            return beverage.cost()+0.33;
        } else  if(beverage.getSize()== medium)
        {
            return beverage.cost()+0.66;
        }

        return beverage.cost()+0.99;
    }
}
