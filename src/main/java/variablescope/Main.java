package variablescope;

public class Main {
    public static void main(String args[]) {
        int a = 20, b = 10;

        Calculation calculationObj = new Calculation();

        calculationObj.addition(10, 20);

        System.out.println("Nawab Object is :" + calculationObj.z);

        Calculation elvisObj = new Calculation();
        elvisObj.addition(20, 50);

        System.out.println("Elvis Object is :" + elvisObj.z);

    }
}
