package exceptions;

public class Calculator {

    //either return square or return 1
    public int square(int n){
        return n*n;
    }

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4};

        Calculator calculatorObj = new Calculator();
        int squaredValue;
        try{
        //either pass num[x] value or pass 1
        squaredValue = calculatorObj.square(num[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("oh my God , Array Index out of bound exception");
            System.out.println(e);
            squaredValue = calculatorObj.square(1);
        }

        //do something 1
        System.out.println("earnest says no problem");

        //do something 2
        System.out.println("print name : nawab");

        System.out.println(squaredValue);
    }

}
