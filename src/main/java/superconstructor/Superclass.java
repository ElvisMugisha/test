package superconstructor;

public class Superclass {
    int age;
    String name;
    Superclass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Superclass() {

    }
    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " + " " + name + " Age " + age);
    }
}
