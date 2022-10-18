package collections;

public class ComperatorDemo {
    public static void main(String[] args) {
        DogType1 dog1 = new DogType1("Dog1", "Brown", 13, "ElvisDog");
        DogType1 dog2 = new DogType1("Dog1", "Brown", 13, "ErnestDog");

        System.out.println(dog1);
        System.out.println(dog2);

        //why do we need comparable, comparator, equals or anything???
        System.out.println(dog1.equals(dog2));
    }
}
