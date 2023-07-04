package DesignPattern.SRP_S;

public interface BankService {
    // A class should have only single reason to change
    /*
    S-SOLID
    BankService is violating the SRP

     */
    double loanInterestCalculate();

    void withdraw();

    void deposit();

    void printpassbook();

    void sendOTP();

}
