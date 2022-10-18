package returnTypes;

import Animals.Person;

public class ReturnTypesMain {

    public static void main (String args[]) {

        Calculator calculateObj = new Calculator();
        int square = calculateObj.getSquareNumber(4);

        Person personAge = new Person();
        personAge.changeAge(20);

        int personAge1 = personAge.giveMeAge();

        String modifiedName = calculateObj.addName("Elvis");

        System.out.println(personAge1);
//        System.out.println(personAge);

//        System.out.println("The square of 4 is: " + square);
    }
}
