package collections;

import java.util.Comparator;

public class ExampleComparator  {

    public static void main(String args[]){
        DogType1 d1 = new DogType1("breed1","brown",5,"nawabsdog");
        DogType1 d2 = new DogType1("breed1","brown",5,"Ntagawasdog");

        System.out.println(d1);
        System.out.println(d2);

        //why do we need comparable, comparator, equals or anything???
        System.out.println(d1.equals(d2));





    }
}
