package AdapterDesignPattern;

public class BirdAdapter implements ToyDuck{
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void jump() {
        bird.fly();
    }
}
