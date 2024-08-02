package lockWithCustomObjects;

public class LocksWithCustomObjectsDemo {
    public static int counter1 = 0;
    public static int counter2 = 0;

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                increment1();
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                increment2();
            }
        });
        one.start();
        two.start();

        try{
            one.join();
            two.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(counter1+" "+counter2);
    }

    public static void increment1() {
        synchronized (lock1){
            counter1++;
        }
    }

    public static void increment2() {
        synchronized (lock2){
            counter2++;
        }
    }
}
