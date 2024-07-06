package oop_concepts.abstraction.interface_;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        //c.nonIfaceMeth();
    }
}
