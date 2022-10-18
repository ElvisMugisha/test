package thisKeyWord;

public class StudentWithoutThis {
    int rollno;
    String name;
    float fee;

    StudentWithoutThis(int r, String n, float f) {
        rollno = r;
        name = n;
        fee = f;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class TestWithoutThis {
    public static void main(String[] args) {
        StudentWithoutThis s1 = new StudentWithoutThis(336, "Elvis", 10000);
        StudentWithoutThis s2 = new StudentWithoutThis(337, "Ernest", 8000);

        s1.display();
        s2.display();
    }
}
