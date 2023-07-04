package DesignPattern.DIP;

public class Shopping {

    /*
    High-level modules should not depend on the low-level module but both should depend on the abstraction
     */
    BankCard bankCard;

    public Shopping(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    void initiatePayment(int amount, BankCard bankCard)
    {

    }
}
