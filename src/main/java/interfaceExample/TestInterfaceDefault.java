package interfaceExample;

interface Drawable1 {
    void draw();
    default void message() {
        System.out.println("Drawing a shape we dont know yet!");
    }
}

class Rectangle1 implements Drawable1 {
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

public class TestInterfaceDefault {
    public static void main(String[] args) {
        Rectangle1 rectangle1 = new Rectangle1();
        rectangle1.message();
        rectangle1.draw();
    }
}
