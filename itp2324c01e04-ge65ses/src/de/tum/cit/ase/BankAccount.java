package de.tum.cit.ase;

public class BankAccount {
    private int balance;
    private String iban;
    private String bankCode;
    private String accountNumber;


    public BankAccount(String iban) {
        this.iban = iban;

        // TODO 4.2  Overloading the BankAccount Constructor
        // public BankAccount(String bankCode, String accountNumber)

    }

    // TODO 4.1 & 4.3
    //1. Overloading the BankAccount Constructor
    //3. Calculate the IBAN for a bankCode and accountNumber



    public String withdrawMoney(int amountWithdrawn) {
        this.balance -= amountWithdrawn;
        return "Your new balance is: " + this.balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", iban='" + iban + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

}
