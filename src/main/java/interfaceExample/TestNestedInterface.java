package interfaceExample;

interface Showable2 {
    void show();

    interface Message {
        void message();
    }
}

public class TestNestedInterface implements Showable2.Message {
    public void message() {
        System.out.println("Hello Nested Interface declared within interface!");
    }

    public static void main(String[] args) {
        TestNestedInterface testNestedInterface = new TestNestedInterface();
        testNestedInterface.message();
    }
}
