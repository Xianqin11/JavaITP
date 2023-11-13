package de.tum.cit.ase;

public class TicketMachine {
    private static final int PRICE = 10;
    private static int ticketsSoldCount = 0;
    private static final BigInteger BLACKLISTED_IBAN = new BigInteger("27100777770209299700");

    public static boolean processPaymentMethod(BigInteger accountNumber) {
        // Generate IBAN from the account number
        BigInteger iban = IBANValidator.generateIBAN(accountNumber);

        // Increase the ticketsSoldCount
        ticketsSoldCount++;

        // Check if the IBAN is blacklisted
        if (ibanIsBlacklisted(iban)) {
            return false;
        }

        return IBANValidator.validateIBAN(iban);
    }

    public static int getTotalRevenue() {
        return PRICE * ticketsSoldCount;
    }

    public static boolean ibanIsBlacklisted(BigInteger iban) {
        return iban.equals(BLACKLISTED_IBAN);
    }
}
