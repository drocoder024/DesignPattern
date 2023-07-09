package AbstractDesignPattern.Example1;

import AbstractDesignPattern.Example1.Fcatory.PizzaFactory;
import AbstractDesignPattern.Example1.Pizza.Pizza;

public class ClientCode {
Pizza pizza;

    public ClientCode(PizzaFactory factory) {
        this.pizza = factory.createPizza();
    }

    void preparePizza()
    {
        pizza.prepare();
    }
}
