package AdapterDesignPattern;

public class DriverMain {
    public static void main(String[] args) {
        Sparrow sparrow= new Sparrow();
        sparrow.fly();
        sparrow.makeSound();

        PlasticToyDuck plasticToyDuck=new PlasticToyDuck();
        plasticToyDuck.jump();

        ToyDuck birdAdapter= new BirdAdapter(sparrow);
        birdAdapter.jump();

    }

}
