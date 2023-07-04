package DesignPattern.DIP;

public class DriverClass {
    public static void main(String[] args) {
        Shopping s1= new Shopping(new CreditCard());
        s1.initiatePayment(1000,new CreditCard());
    }
}
