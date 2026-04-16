package MultiThreading;

import java.util.Scanner;

class Mul_Threading {
    public static void main(String[] args) {
        System.out.println("Main Method Executing and openned a file.....");
        Printnum pn = new Printnum();
        Addition ad = new Addition();
        Thread p = new Thread(pn);
        Thread a = new Thread(ad);
        p.start();
        a.start();

        try {
            p.join();
            a.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main Method Executing and closed a file.....");
    }
}

class Printnum implements Runnable {
    public void run() {
        System.out.println("Printing number Activity Started");
        for(int i=0; i<10; i++) {
            System.out.print(i+" ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing number Activity Ended");
    }
}

class Addition implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition Activity Started");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Addition Activity Ended");
    }
}