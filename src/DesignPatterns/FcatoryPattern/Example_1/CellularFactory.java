package FcatoryPattern.Example_1;

public class CellularFactory {
    public static CellularPlan getPlan(String type)
    {
        CellularPlan cellularPlan = null;
        if(type.equalsIgnoreCase("Airtel"))
            cellularPlan=new AirtelPlan();
        else if (type.equalsIgnoreCase("Jio"))
            cellularPlan=new JioPlan();
        return cellularPlan;
    }
}
