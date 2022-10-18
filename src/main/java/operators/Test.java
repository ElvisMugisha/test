package operators;

public class Test {
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;

        System.out.println( "Value of b is : " + b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
    }
}

class SwitchTest {
    public static void main(String args[]) {
// char grade = args[0].charAt(0);
        char grade = 'A';

        switch(grade) {

            case 'A' :
                System.out.println("Excellent!");
                break;

            case 'B' :
                System.out.println("Very good");
                break;

            case 'C' :
                System.out.println("Well done");
                break;

            case 'D' :
                System.out.println("You passed");
                break;

            case 'F' :
                System.out.println("Better try again");
                break;

            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
