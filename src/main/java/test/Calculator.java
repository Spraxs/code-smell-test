package test;

public class Calculator {

    public double getBalanceAfterTaxes(Wallet wallet) {
        return wallet.getBalance() * 0.89;
    }
}
