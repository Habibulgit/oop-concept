package oop_concepts.abstraction.bank_account;

public class Account extends Bank{
    int id;
    String password;



    Account(int id ,String password) {
        this.id = id;
        this.password = password;
    }
    protected int accountId() {
        return 12300;
    }
    protected final String accName() {
        return "mehedi";
    }

    protected final double balance() {
        return 1200.12;
    }
    protected final String pass() {
        return "1234qwer";
    }

    void check() {
        if(pass().equals(password) && id == accountId())
            display();
        else
            System.out.println("  ' Invalid Password or User Id '  ");
        System.out.println("\n");
    }

}
