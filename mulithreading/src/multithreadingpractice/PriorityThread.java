package multithreadingpractice;

public class PriorityThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getPriority());
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, "Hii Thread");

        Thread t2 = new Thread(()->{
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, "Hello Thread");
//        t1.setName("Hii Thread");
//        t2.setName("Hello Thread");

//        System.out.println(t1.getName());
//        System.out.println(t2.getName());
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
    }
}
