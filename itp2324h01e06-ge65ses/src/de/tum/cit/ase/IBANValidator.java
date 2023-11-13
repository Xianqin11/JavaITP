package de.tum.cit.ase;

import java.math.BigInteger;

public class IBANValidator {
    public static boolean checkLengthAndSignWhenValidating(BigInteger iban) {
        // Check the IBAN for its length and non-negativity
        BigInteger maxLength = BigInteger.TEN.pow(20);
        return iban.compareTo(maxLength) == -1 && iban.compareTo(BigInteger.ZERO) != -1;
    }

    public static boolean validateIBAN(BigInteger iban) {
        if (checkLengthAndSignWhenValidating(iban)) {
            BigInteger shifted = iban.divide(BigInteger.TEN.pow(2));
            BigInteger accountNumber = shifted.mod(BigInteger.TEN.pow(18));
            BigInteger shiftedAccount = accountNumber.multiply(BigInteger.TEN.pow(6));
            BigInteger total = shiftedAccount.add(1314);

            return total.mod(BigInteger.valueOf(97)).intValue() == 1;
        } else {
            return false;
        }
    }

    public static BigInteger generateIBAN(BigInteger accountNumber) {
        BigInteger checksum = 98 - (accountNumber.multiply(BigInteger.TEN.pow(2)).mod(BigInteger.valueOf(97))).intValue();
        return accountNumber.multiply(BigInteger.TEN.pow(2)).add(checksum).multiply(BigInteger.TEN.pow(2));
    }
}


