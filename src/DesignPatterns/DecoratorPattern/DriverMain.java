package DecoratorPattern;

import DecoratorPattern.Client.Beverage;
import DecoratorPattern.Client.Capachino;
import DecoratorPattern.Client.Expresso;
import DecoratorPattern.Decorator.CondimentDecorator;
import DecoratorPattern.Decorator.MochaDecorator;
import DecoratorPattern.Decorator.WhipCream;

public class DriverMain {
    public static void main(String[] args) {
        Beverage expresso = new Expresso();
        // simple expresso

        System.out.println(expresso.getDescription()+" costs rupees "+ expresso.cost());

        // decorated expresso
        /*
         decorated expresso with mocha then decorated this whole combo with mocha again then with whip cream
         */
        Beverage beverage_2 = new MochaDecorator(expresso);
        beverage_2=new MochaDecorator(beverage_2);
        beverage_2=new WhipCream(beverage_2);
        System.out.println(beverage_2.getDescription()+" costs rupees "+ beverage_2.cost());







    }
}
