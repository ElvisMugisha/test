package overriding;

public class Main {
    public static void main(String args[]) {
        int a = 10, b = 10;

//        My_Calculation my_calculationObj = new My_Calculation();
//        my_calculationObj.addition(20, 30);
//        my_calculationObj.division(60, 3);
//
//        Calculation calculationObj = new Calculation();
//        calculationObj.addition(20, 30);
//        calculationObj.division(50, 10);

        Calculation myObj = new My_Calculation();
        myObj.addition(10, 5);

    }
}
