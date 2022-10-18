package thisKeyWord;

public class ThisInConstructor {
    int rollno;
    String name, cource;
    float fee;

    ThisInConstructor(int rollno, String name, String cource) {
        this.rollno = rollno;
        this.name = name;
        this.cource = cource;
    }

    ThisInConstructor(int rollno, String name, String cource, float fee) {
        this(rollno, name, cource); // Reusing constructor and must be the first statement in here.
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + cource + " " + fee);
    }
}

class TestThisInConstructor {
    public static void main(String[] args) {
        ThisInConstructor t1 = new ThisInConstructor(100, "Elvis", "Java Training", 5000f);
        ThisInConstructor t2 = new ThisInConstructor(101, "Ernest", "Java Training", 5000f);

        t1.display();
        t2.display();
    }
}
