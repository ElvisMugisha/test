package variablescope;

public class Calculation {
   int z;

   public void addition(int x, int y) {
       int a;
       z = x + y;
       a = x + y * 10;
       System.out.println("The sum of the given numbers:"+z);
       System.out.println("The value of a is :"+a);
   }
   public void Subtraction(int x, int y) {
       z = x - y;
       System.out.println("The difference between the given numbers:"+z);
   }
}
