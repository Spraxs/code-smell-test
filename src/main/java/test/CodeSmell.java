package test;

import java.util.logging.Logger;

public class CodeSmell {
    private static final Logger LOGGER = Logger.getLogger(CodeSmell.class.getName());

    public static void main(String[] args) {
        final Wallet wallet = new Wallet();
        final Calculator calculator = new Calculator();

        LOGGER.info("" + calculator.getBalanceAfterTaxes(wallet));
    }
}
