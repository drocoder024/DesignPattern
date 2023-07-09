package AbstractDesignPattern.Example1;

import AbstractDesignPattern.Example1.Fcatory.Dominoz;

public class Main {
    public static void main(String[] args) {
        // fcatory design pattern helps us create similar kind of product as a creation design pattern
        ClientCode code = new ClientCode(new Dominoz());
        code.preparePizza();
    }
}
