package sequential;

public class SequentialExecutionDemo {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo1() {
        for(int i=1; i<=10; i++) {
            System.out.println("from demo1 "+i);
        }
    }

    private static void demo2() {
        for(int i=1; i<=10; i++) {
            System.out.println("from demo2 "+i);
        }
    }
}
