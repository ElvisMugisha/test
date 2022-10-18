package encapsulation;

public class Main {
    public static void main(String args[]) {
        int a = 10, b = 10;
        My_Calculation myObj = new My_Calculation();
//        myObj.age = 1000;
        myObj.setAge(150);
        myObj.printAge();

    }
}
