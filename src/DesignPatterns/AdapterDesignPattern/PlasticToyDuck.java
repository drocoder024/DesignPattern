package AdapterDesignPattern;

public class PlasticToyDuck implements ToyDuck{
    @Override
    public void jump() {
        System.out.println("jump high");
    }
}
