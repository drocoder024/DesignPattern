package DecoratorPattern.Client;

public abstract class Beverage {

    public enum SIZE {small,medium,tall};
    public SIZE size=SIZE.tall;

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    private String description="unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();



}
