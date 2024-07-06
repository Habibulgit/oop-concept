package oop_concepts.abstraction.demo1234;

public class Triangle0 extends Figure0{
    Triangle0(double a,double b) {
        super(a,b);
    }
    void area() {
        System.out.println("inside area of triangle ");
        System.out.println("triangle is : "+(dim1 * dim2 / 2));
    }
}
