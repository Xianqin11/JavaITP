package de.tum.cit.ase;

import java.math.BigInteger;

public class BankServices {
    public static BankAccount createBankAccountForCustomer(Customer customer, String IBAN) {
        // TODO 5.1
        return null;
    }

    public static String withdrawMoney(Customer customer, int amountWithdrawn) {
        // TODO 5.2
        return null;
    }

    public static String convertIBANToBankCode(String IBAN) {
        return IBAN.substring(4, 12);
    }

    public static String covertIBANToAccountNumber(String IBAN) {
        return IBAN.substring(12, 22);
    }

    public static String generateIBAN(String bankCode, String accountNumber) {
        String ibanBase = bankCode + accountNumber + "131400";
        BigInteger bigInteger = new BigInteger(ibanBase);
        int checkDigitsValue = 98 - bigInteger.mod(new BigInteger("97")).intValue();
        return "DE" + String.format("%02d", checkDigitsValue) + bankCode + accountNumber;
    }
}
