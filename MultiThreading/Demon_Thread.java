package MultiThreading;

public class Demon_Thread {
    public static void main(String[] args) {
        Task tc = new Task();

        Thread t1 = new Thread(tc);
        Thread t2 = new Thread(tc);
        Thread t3 = new Thread(tc);

        t1.setName("Type");

        t2.setName("Spell");
        t3.setName("AutoSave");

        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
    
}

class Task implements Runnable {
    @Override
    public void run() {
        try {
            String name = Thread.currentThread().getName();
            if(name.equals("Type")) {
                typing();
            }
            else if(name.equals("Spell")) {
                spellCheck();
            } else {
                autoSaving();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void typing() throws InterruptedException {
        for(int i=1; i<=5; i++) {
            System.out.println("Typing....");
        Thread.sleep(3000);
        }
    }

    
    public void spellCheck() throws InterruptedException {

        for(;;) {
            System.out.println("SpellChecking....");
        Thread.sleep(3000);
        }
    }

    
    public void autoSaving() throws InterruptedException {
        for(;;) {
            System.out.println("AutoSaving....");
        Thread.sleep(3000);
        }
    }
}