package multithreadingpractice;

public class MultiThreadFirstClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("First Thread "+i);
        }
    }
}
