package interfaceExample;

public interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle!");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing square!");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle!");
    }
}

class TestInterfaceExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();

        rectangle.draw();
        square.draw();
        circle.draw();
    }
}
