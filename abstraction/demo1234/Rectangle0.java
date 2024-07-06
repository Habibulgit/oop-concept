package oop_concepts.abstraction.demo1234;

public class Rectangle0 extends Figure0{
    Rectangle0(double a,double b) {
        super(a,b);
    }
    void area() {
        System.out.println("inside area of rectangle ");
        System.out.println("area is : "+(dim1 * dim2));
    }
}
