package AbstractDesignPattern.Example1.Fcatory;

import AbstractDesignPattern.Example1.Pizza.PepporoniPizza;
import AbstractDesignPattern.Example1.Pizza.Pizza;

public class PizzAaHut implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PepporoniPizza();
    }
}
