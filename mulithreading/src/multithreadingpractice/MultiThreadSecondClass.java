package multithreadingpractice;

public class MultiThreadSecondClass extends Thread implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("Second Thread: " + i);
        }
    }
}
