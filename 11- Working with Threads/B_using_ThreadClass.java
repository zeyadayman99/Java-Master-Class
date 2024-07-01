package org.example;

public class B_using_ThreadClass extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B Thread started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
