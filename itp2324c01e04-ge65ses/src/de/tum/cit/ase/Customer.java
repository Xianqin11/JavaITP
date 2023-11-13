package de.tum.cit.ase;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;

    // TODO 3.1 connect a BankAccount to a Customer.
    // add BankAccount as an attribute to Customer and add getters/setters
    private BankAccount bankAccount; //Unidirectional association

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // TODO 3.2 Overloading the Customer Constructor
    //We can now create a Customer Object with or without a BankAccount Object
    public Customer(String firstName, String lastName, int age,BankAccount bankAccount){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bankAccount = bankAccount;
    }

    public String outputWelcomeMessage() {
        return "Hello " + this.firstName + " " + this.lastName +". Nice to see you again!";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //add getters/setters for the new attribute BankAccount
    public BankAccount getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}

