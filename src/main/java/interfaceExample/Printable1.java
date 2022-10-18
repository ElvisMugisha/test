package interfaceExample;

public interface Printable1 {
    void print();
}

interface Showable {
    void show();
}

class Shape implements Printable1, Showable {
    public void print() {
        System.out.println("Printing a shape...");
    }

    public void show() {
        System.out.println("Showing a shape...");
    }
}

class TestMultipleInheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.print();
        shape.show();
    }
}