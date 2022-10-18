package interfaceExample;

public interface Alphabet {
    void a();
    void b();
    void c();
    void d();
}

abstract class Display implements Alphabet {
    public void c() {
        System.out.println("I am C");
    }
}

class Using extends Display {
    public void a() {
        System.out.println("I am A");
    }
    public void b() {
        System.out.println("I am B");
    }
    public void d() {
        System.out.println("I am D");
    }
}

class Test {
    public static void main(String[] args) {
        Using alphabet = new Using();

        alphabet.a();
        alphabet.b();
        alphabet.c();
        alphabet.d();
    }
}
