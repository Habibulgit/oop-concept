package oop_concepts.abstraction.bank_account;

public abstract class Bank {
    abstract int accountId();
    abstract String accName();
    abstract double balance();
    abstract String pass();

    void display() {
        System.out.println("Account id      : "+accountId());
        System.out.println("Account Name    : "+accName());
        System.out.println("Account Balance : "+balance());
    }
}
