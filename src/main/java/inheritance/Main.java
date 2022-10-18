package inheritance;

public class Main {
    public static void main(String args[]) {
        int a = 10, b = 10;
//        My_Calculation demo = new My_Calculation();
//        demo.addition(a, b);
//        System.out.println("Z value is: " + demo.z);
//        demo.Subtraction(a, b);
//        demo.multiplication(a, b);
//
//        System.out.println("Z value is: " + demo.z);

        Calculation calculationObj = new Calculation();
        System.out.println(calculationObj.z);

        My_Calculation my_calculationObj = new My_Calculation();
        System.out.println(my_calculationObj.z);

//        calculationObj.addition(a, b);

        Calculation calculationParentReference = new My_Calculation();
        System.out.println(calculationParentReference.z);
//        calculationParentReference.Subtraction(a, b);


    }
}
