package abstraction;

public class AbstractClassChild extends  AbstractClassParent {
    public int doSomething(int a) {
        return a + 2;
    }

    public static void main(String[] args) {
        System.out.println(new AbstractClassChild().doSomething(3));
    }
}

