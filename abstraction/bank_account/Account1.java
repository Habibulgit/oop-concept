package oop_concepts.abstraction.bank_account;

public class Account1 extends Bank{
    int id;
    String password;



    Account1(int id ,String password) {
        this.id = id;
        this.password = password;
    }
    protected int accountId() {
        return 12301;
    }
    protected final String accName() {
        return "bashar";
    }

    protected final double balance() {
        return 1500017.1;
    }
    protected final String pass() {
        return "1510";
    }

    void check() {
        if(pass().equals(password) && id == accountId())
            display();
        else
            System.out.println("  ' Invalid Password or User Id '  ");

        System.out.println("\n");
    }


}
