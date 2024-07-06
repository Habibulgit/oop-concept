package oop_concepts.abstraction.interface_;

public class Client implements Callback{
    public void callback(int p) {
        System.out.println("callback called with "+p);
    }

    void nonIfaceMeth() {
        System.out.println("classes that implement interface " +
                " may also other members ,too ");
    }
}
