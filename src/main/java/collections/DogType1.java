package collections;

import java.util.Comparator;
import java.util.Objects;

public class DogType1  {

    private String breed;
    private String color;
    private int age;
    //name does not matter to me
    private String name;

    public DogType1(String breed, String color, int age, String name){
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DogType1{" +
                "breed='" + breed + '\'' +
                ", color=" + color +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogType1 dogType1 = (DogType1) o;
        return Objects.equals(breed, dogType1.breed) &&
                Objects.equals(color, dogType1.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, color);
    }

    //if all 4 field are equal then 3 will obviously be equal

/*
        if (o == null || getClass() != o.getClass()) return false;
    DogType1 dogType1 = (DogType1) o;
        return age == dogType1.age &&
            Objects.equals(breed, dogType1.breed) &&
            Objects.equals(color, dogType1.color) &&
            Objects.equals(name, dogType1.name);*/
}
