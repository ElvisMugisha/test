package interfaceExample;

public interface Printable2 {
    void print();
}

interface Showable1 extends Printable2 {
    void show();
}

class Shape1 implements Showable1 {
    public void print() {
        System.out.println("Printing a shape1...");
    }

    public void show() {
        System.out.println("Showing a shape1...");
    }
}

class TestInterfaceInheritance {
    public static void main(String[] args) {
        Shape1 shape1 = new Shape1();
        shape1.print();
        shape1.show();
    }
}
