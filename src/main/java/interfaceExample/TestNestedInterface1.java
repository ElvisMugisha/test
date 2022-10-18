package interfaceExample;

class Drawable3 {
    void draw() {
        System.out.println("Drawing a shape3!");
    }

    interface Shape {
        void shape();
    }

    interface Message {
        void message();
    }
}

class Rectangle3 extends Drawable3 {
    void draw() {
        System.out.println("Drawing a rectangle3...");
    }
}

public class TestNestedInterface1 implements Drawable3.Message, Drawable3.Shape {
    public void message() {
        System.out.println("Nested interface declared within a class...");
    }

    public void shape() {
        System.out.println("You guested right, its a rectangle!");
    }

    public static void main(String[] args) {
        Rectangle3 rectangle3 = new Rectangle3();
        rectangle3.draw();

        TestNestedInterface1 testNestedInterface1 = new TestNestedInterface1();
        testNestedInterface1.message();
        testNestedInterface1.shape();
    }
}
