public class Multithreading {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            MultithreadingDemo obj = new MultithreadingDemo();
            obj.start();
        }
    }
}
