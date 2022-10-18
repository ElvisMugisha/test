package superconstructor;

public class Subclass extends Superclass {
    Subclass(int age) {
        super(age, "Elvis");
        int a = 10;
    }
    public static void main(String args[]) {
        Subclass s = new Subclass(24);
        s.getAge();
    }
}
