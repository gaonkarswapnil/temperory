package multithreadingpractice;

class HiRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println("Hii");
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class HelloRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        HiRunnable obj1 = new HiRunnable();
        HelloRunnable obj2 = new HelloRunnable();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
