package AdapterDesignPattern.PUBG;

public class Player implements CommonPlayer{
    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void shoot() {
        System.out.println("shoot");
    }
}
