package basicMultithreading;

public class RunnableThreadExample {
    public static void main(String[] args) {
//        Runnable obj = new ThreadOne();
//        Runnable obj1 = new ThreadTwo();
        Thread obj = new Thread(new ThreadOne());
        Thread obj1 = new Thread(new ThreadTwo());
        Thread obj2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 20; i++){
                    System.out.println("Thread three "+i);
                }
            }
        });
        Thread obj3 = new Thread(()->{
            for(int i = 0; i < 50; i++){
                System.out.println("Thread 4 "+i);
            }
        });
        obj.start();
        obj1.start();
        obj2.start();
        obj3.start();
    }
}

class ThreadOne implements Runnable{
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("Thread one "+i);
        }
    }
}

class ThreadTwo implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<15; i++){
            System.out.println("Thread two "+i);
        }
    }
}