package AdapterDesignPattern;

public class Sparrow implements Bird{
    @Override
    public void makeSound() {
        System.out.println("chirp chirp");
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }
}
