package thisKeyWord;

public class StudentWithThis {
    int rollno;
    String name;
    float fee;

    StudentWithThis(int rollno,String name,float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display() {
        System.out.println(rollno+" "+name+" "+fee);
    }
}

class TestWithThis{
    public static void main(String args[]){
        StudentWithThis s1=new StudentWithThis(111,"Hilaire",5000f);
        StudentWithThis s2=new StudentWithThis(112,"Raisa",6000f);

        s1.display();
        s2.display();
    }
}
