package encapsulation;

public class My_Calculation {
    private int age;

    public void setAge(int age){
        if (age < 150){
            this.age = age;
        }
        else if (age == 150){
            System.out.println("Age is equal to : " + age);
        }
        else {
            System.out.println("Wrong Age");
        }
    }

    public int getAge(){
        return age;
    }
    public void printAge() {
        System.out.println("Age is : " + age);
    }
}
