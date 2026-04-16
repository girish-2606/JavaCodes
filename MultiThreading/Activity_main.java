package MultiThreading;

import java.util.Scanner;

public class Activity_main {
    public static void main(String[] args) {
        Activity aa = new Activity();
        Activity ab = new Activity();
        Activity ac = new Activity();

        aa.setName("ADD");
        ab.setName("CHAR");
        ac.setName("NUM");

        aa.start();
        ab.start();
        ac.start();
    }
}

class Activity extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        if(name.equals("ADD")) {
            addition();
        } else if(name.equals("CHAR")) {
            printChar();
        } else {
            printNum();
        }
    }
    
    
    void addition() {
        System.out.println("Addition activity started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int res = a + b;
        System.out.println(res);
        System.out.println("Addition activity ended...");
        sc.close();
    }

    void printChar() {
        System.out.println("Printing character activity started...");
        for(char ch = 'A'; ch <= 'I'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing activity ended...");
    }

    void printNum() {
        System.out.println("Printing num activity started...");
        for(int i=1; i<=10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing num activity ended...");
    }
}
