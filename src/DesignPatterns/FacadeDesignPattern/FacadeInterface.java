package FacadeDesignPattern;

public class FacadeInterface {
    AdditionOperation additionOperation;
    MultiplyOperation multiplyOperation;

    public FacadeInterface() {
        this.additionOperation = new AdditionOperation();
        this.multiplyOperation=new MultiplyOperation();
    }

    public void doProcess()
    {
        System.out.println(additionOperation.operate(multiplyOperation.operate(6,8), additionOperation.operate(5,8) ));
    }
}
