package Animals;

import org.example.Javatraining;

public class Dog {

    public Dog(int age, String color, String breed)
    {
        this.age = age;
        this.color = color;
        this.breed = breed;
    }


    private String breed;
    private int age;
    private String color;
    private String houseAddress;


    void barking() {

    }

    void hungry() {

    }

    void sleeping() {

    }

    public void setAge(int age) {
//        Rules for Age
        this.age = age;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Elvis dog is: " +
                this.age +
                " years old with a color: " +
                color +
                " and breed: " +
                breed;
    }
}
