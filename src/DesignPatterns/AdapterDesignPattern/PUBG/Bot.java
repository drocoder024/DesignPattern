package AdapterDesignPattern.PUBG;

public class Bot implements ArtificialPlayer{
    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void smashHand() {
        System.out.println("smash");
    }
}
