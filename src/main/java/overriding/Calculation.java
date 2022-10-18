package overriding;

public class Calculation {
   int z;
   public void addition(int x, int y) {
       z = x + y;
       System.out.println("Parent addition is :"+z);
   }
   public void Subtraction(int x, int y) {
       z = x - y;
       System.out.println("Parent subtraction is :"+z);
   }

    public void division(int x, int y) {
        z = x / y;
        System.out.println("Parent division is :" + z);
    }
}
