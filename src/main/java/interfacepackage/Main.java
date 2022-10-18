package interfacepackage;

public class Main {
    public static void main(String[] args) {
        Calculator myCar = new CalculatorChild();
        System.out.println(myCar.addition(10, 12));
    }
}
