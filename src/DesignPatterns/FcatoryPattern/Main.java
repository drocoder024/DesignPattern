package FcatoryPattern;

import FcatoryPattern.Pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("mozerella");
    }
}
