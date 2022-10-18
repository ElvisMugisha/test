package org.example;

import Animals.Dog;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Everyone!");

        Dog elvisDog = new Dog(15, "'Brown'", "'St 447, Kigali'");
//        Dog elvisDog2 = new Dog(20);

//        elvisDog.setAge(10);
//        elvisDog.setBreed("");
//        elvisDog.setColor("white and Black");


        System.out.println("At this point of time the object is: " + elvisDog);
//        elvisDog.setAge(20);
//        elvisDog.setColor("white and Black");
//        System.out.println("At this point of time the object is: " + elvisDog2);

        char ch = 'E';

        System.out.println(Character.isUpperCase(ch));

    }
}
