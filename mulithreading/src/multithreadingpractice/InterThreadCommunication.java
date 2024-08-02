package multithreadingpractice;

class Q{
    int num;
    boolean valueSet = false;
    public synchronized void put(int num){
        while (valueSet){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Put "+num);
        this.num = num;
        valueSet = true;
        notify();
    }
    public synchronized void get(){
        while (!valueSet){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Get "+num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    Producer(Q q){
         this.q = q;
         Thread t1 = new Thread(this,"Producer");
         t1.start();

    }
    @Override
    public void run() {
        int i=0;
        while(true){
            q.put(i);
            i++;
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q = q;
        Thread t2 = new Thread(this,"Consumer");
        t2.start();

    }
    @Override
    public void run() {
        while (true){
            q.get();
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
