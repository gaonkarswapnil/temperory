package basicMultithreading;

public class DeamonUserThreadExample {
    public static void main(String[] args) {
        Thread bgThread = new Thread(new DeamonThread());
        Thread userThread = new Thread(new UserThread());
        bgThread.setDaemon(true);
        bgThread.start();
        userThread.start();
    }
}

class DeamonThread implements Runnable{

    @Override
    public void run() {
        int count = 0;
        while(count<500){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Deamon Thread Running...");
            count++;
        }
    }
}

class UserThread implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("User Thread Running...");
    }
}