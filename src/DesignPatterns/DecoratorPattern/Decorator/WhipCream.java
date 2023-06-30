package DecoratorPattern.Decorator;

import DecoratorPattern.Client.Beverage;

public class WhipCream extends CondimentDecorator{
    public WhipCream(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.77;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" whip cream";
    }
}
