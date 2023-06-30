package FcatoryPattern;

import FcatoryPattern.Pizza.Pizza;

public abstract class PizzaStore {

    Pizza pizza;

    public Pizza orderPizza(String type)
    {
        pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.serve();
        System.out.println("pizza order -> "+ pizza.getClass().getName());
        return  pizza;


    }
    // factory method
    public abstract Pizza createPizza(String type);
}
