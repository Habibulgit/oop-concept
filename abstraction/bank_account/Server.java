package oop_concepts.abstraction.bank_account;

public class Server {
    public static void main(String[] args) {
        var p = new Person(12300,"1234qwer");
        var p1 = new Person1(12301,"1510");
        p.check();
        p1.check();

    }
}
