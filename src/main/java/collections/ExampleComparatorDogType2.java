package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleComparatorDogType2 {

    public static void main(String args[]){
        DogType2 dog21 = new DogType2("dog4",23,5,32);
        DogType2 dog22 = new DogType2("dog2",7,12,333);
        DogType2 dog23 = new DogType2("dog5",17,3,21);
        DogType2 dog24 = new DogType2("dog4",22,11,170);
        DogType2 dog25 = new DogType2("dog1",2,4,12);

        /*System.out.println(dog21);
        System.out.println(dog22);
        System.out.println(dog23);
        System.out.println(dog24);
        System.out.println(dog25);
*/
        //List inside List
        List<DogType2> allDogs = new ArrayList<DogType2>();
        allDogs.add(dog21); //references of Parent - but not child of
        allDogs.add(dog22);
        allDogs.add(dog23);
        allDogs.add(dog24);
        allDogs.add(dog25);

        System.out.println(allDogs);

        //allDogs.get(1).printName();


        //we can have list of objects

        //thats how internet works

        Collections.sort(allDogs);
        System.out.println(allDogs);




        //why do we need comparable, comparator, equals or anything???
        //System.out.println(d1.equals(d2));





    }
}
