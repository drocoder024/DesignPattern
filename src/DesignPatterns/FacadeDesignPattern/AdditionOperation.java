package FacadeDesignPattern;

public class AdditionOperation implements Operation {

    @Override
    public int operate(int num1, int num2) {
        return num1+num2;
    }
}
