package FcatoryPattern.Example_1;

public class Main {
    public static void main(String[] args) {
        CellularPlan cellularPlan= CellularFactory.getPlan("Airtel");
        System.out.println(cellularPlan.getRate());
    }
}
