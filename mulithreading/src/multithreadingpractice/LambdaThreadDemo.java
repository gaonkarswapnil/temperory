package multithreadingpractice;

public class LambdaThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=5; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<=5; i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
