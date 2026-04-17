package MultiThreading;

public class Race_Condition {
    
    static int count = 10;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                count -= 1;
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                count -= 1;
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count: "+count);
    }    
}
