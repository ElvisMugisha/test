package inheritance;

public class Calculation {
   int z = 20;
   public void addition(int x, int y) {
       z = x + y;
       System.out.println("The sum of the given numbers:"+z);
   }
   public void Subtraction(int x, int y) {
       z = x - y;
       System.out.println("The difference between the given numbers:"+z);
   }
}
