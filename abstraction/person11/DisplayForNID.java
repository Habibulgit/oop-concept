package oop_concepts.abstraction.person11;

public class DisplayForNID {
    void print(){
        Mehedi m = new Mehedi();
        System.out.println("name          : "+m.name());
        System.out.println("age           : "+m.age());
        System.out.println("father's name : "+m.fathersName());
        System.out.println("mother's name : "+m.mothersName());
        System.out.println("nid number    : "+m.nidNum());
        System.out.println("date of birth : "+m.dateOfBirth());

    }


}
