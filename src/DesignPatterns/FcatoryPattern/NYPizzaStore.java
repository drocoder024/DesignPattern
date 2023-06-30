package FcatoryPattern;

import FcatoryPattern.Pizza.CheesePizza;
import FcatoryPattern.Pizza.MozerellaPizza;
import FcatoryPattern.Pizza.Pizza;

// subclass is delegated with Object Instantiation
public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = new Pizza();
        if(type.equalsIgnoreCase("mozerella"))
           pizza=new MozerellaPizza();
        else if(type.equalsIgnoreCase("cheese"))
            pizza=new CheesePizza();

        return pizza;

    }
}
