package overriding;

public class My_Calculation extends Calculation {
    int z;

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("Child multiplication is :"+z);
    }

    public void division(int x, int y) {
        z = x / y;
        System.out.println("Child division is :" + z);
    }

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("Child addition is :"+z);
    }
}
