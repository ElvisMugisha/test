package exceptions;

public class FinallyDemo {

    //either return square or return 1
    public int square(int n) {
        return n * n;
    }

    public void closeConnection() {
        //I am here to close connection
        System.out.println("closing database connections....");
    }

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4};

        FinallyDemo calculatorObj = new FinallyDemo();
        int squaredValue = 0;
        try {
            //either pass num[x] value or pass 1
            squaredValue = calculatorObj.square(num[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("oh my God , Array Index out of bound exception");
            System.out.println(e);
            squaredValue = calculatorObj.square(1);
        } finally {
            //closing the connection logic
            calculatorObj.closeConnection();

        }

        //do something 1
        System.out.println("earnest says no problem");

        //do something 2
        System.out.println("print name : nawab");

        System.out.println(squaredValue);
    }

}
