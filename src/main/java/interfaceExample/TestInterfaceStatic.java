package interfaceExample;

interface Drawable2 {
    void draw();
    static int cube (int x) {
        return x * x * x;
    }
}

class Rectangle2 implements Drawable2 {
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

public class TestInterfaceStatic {
    public static void main(String[] args) {
        Rectangle2 rectangle2 = new Rectangle2();
        rectangle2.draw();

        System.out.println("Its cube is : " +Drawable2.cube(2));
    }
}
