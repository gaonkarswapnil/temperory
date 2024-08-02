package multithreadingpractice;

class Hi extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(50);
            }catch (Exception e){
                e.printStackTrace();
            }
        }


//        System.out.println("Hi");
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(50);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
//        System.out.println("Hello");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj = new Hi();
        Hello obj2 = new Hello();

        obj.start();
        try{
            Thread.sleep(50);
        }catch (Exception e){
            e.printStackTrace();
        }

        obj2.start();
    }
}
