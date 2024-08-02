package multithreadingpractice;

public class MultiThreadMain {
    public static void main(String[] args) {

        try {
//            Thread obj1 = new Thread(new MultiThreadFirstClass());
//            Thread obj2 = new Thread(new MultiThreadSecondClass());

            Thread obj1 = new MultiThreadFirstClass();
            Thread obj2 = new MultiThreadSecondClass();

            obj1.start();
            obj2.start();
            obj1.sleep(1000);
//            obj1.wait(2000);
//            obj1.notify();


/*
            obj1.join();
            obj2.join();
*/
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
