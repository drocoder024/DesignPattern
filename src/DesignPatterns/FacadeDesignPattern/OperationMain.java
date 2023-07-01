package FacadeDesignPattern;

public class OperationMain {
    public static void main(String[] args) {
        FacadeInterface processor = new FacadeInterface();
        processor.doProcess();

        // Facade design pattern helps to hide client part implementation
        // and provides a simplified  interface to connect with client
    }
}
