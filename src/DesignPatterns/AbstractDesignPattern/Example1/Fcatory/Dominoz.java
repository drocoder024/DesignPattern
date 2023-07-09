package AbstractDesignPattern.Example1.Fcatory;

import AbstractDesignPattern.Example1.Pizza.CheesePizza;
import AbstractDesignPattern.Example1.Pizza.Pizza;

public class Dominoz implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
