package exceptions;

public class Unchecked_Demo {
    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4};

        try {
            //do something - 0
            System.out.println(num[6]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("i think array might be out of index");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("i think it might be dividing by zero");
            System.out.println(e);
        }
        //catch chaining
        catch(Exception e){
            System.out.println("it's not indexoutofBoundException, its a different Exception");
            System.out.println(e);
        }
        //do something 1
        System.out.println("earnest says no problem");

        //do something 2
        System.out.println("print name : nawab");
    }

}
