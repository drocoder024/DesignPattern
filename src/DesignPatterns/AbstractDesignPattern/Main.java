package AbstractDesignPattern;

import AbstractDesignPattern.Factory.GUIFactory;
import AbstractDesignPattern.Factory.MacOSFactory;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory =new MacOSFactory();

        Application application = new Application(factory);
        application.work();
    }
}
