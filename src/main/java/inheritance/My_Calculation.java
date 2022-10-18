package inheritance;

public class My_Calculation extends Calculation {
    int z = 10;

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }
}
