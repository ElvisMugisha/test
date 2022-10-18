package collections;

import java.util.Comparator;
import java.util.Objects;

public class DogType2  implements  Comparator<DogType2>,Comparable<DogType2>{

    private String name;
    private int randomNumber;
    private int age;
    private int xyz;
    //name does not matter to me


    public DogType2(String name, int randomNumber, int age, int xyz) {
        this.name = name;
        this.randomNumber = randomNumber;
        this.age = age;
        this.xyz = xyz;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getRandomNumber() {

        return randomNumber;
    }

    public void setRandomNumber(Integer randomNumber) {

        this.randomNumber = randomNumber;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getXyz() {

        return xyz;
    }

    public void setXyz(int xyz) {

        this.xyz = xyz;
    }

    public void printName(){

        System.out.print(this.name);
    }

    @Override
    public String toString() {
        return "DogType2{" +
                "name='" + name + '\'' +
                ", randomNumber=" + randomNumber +
                ", age=" + age +
                ", xyz=" + xyz +
                '}';
    }


    @Override
    public int compare(DogType2 o1, DogType2 o2) {

        return o2.randomNumber - o1.randomNumber;
    }

    @Override
    public int compareTo(DogType2 o) {

        return (this.getName()).compareTo(o.name);
    }
}
