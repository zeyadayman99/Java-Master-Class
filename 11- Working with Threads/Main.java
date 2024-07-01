package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Using Thread Class
        Thread threadA = new A_using_ThreadClass();
        Thread threadB = new B_using_ThreadClass();
        System.out.println(threadA.getPriority() + " " + threadB.getPriority());
        threadA.setPriority(Thread.MAX_PRIORITY);
        threadA.start();
        threadB.start();

        //when it happens that there is 2 "B Thread Started" following each other
        //it's because it could happen that the 2 threads have gone to the scheduler
        //at the same time so the scheduler choose according to the priority of the thread
        //and the actual scheduler algorithm decides as well

        //Using Runnable Interface
        Runnable threadA1 = new A_using_RunnableInterface();
        Runnable threadB1 = new B_using_RunnableInterface();

        //other way to create Runnable without creating a class that implements Runnable
        //we instantiate the interface using anonymous class & lambda expressions
        Runnable runnableA = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("A Thread Started");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
        };
        Runnable runnableB = ()  -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("B Thread Started");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
        };
        //Thread tA = new Thread(runnableA);
        //Thread tB = new Thread(runnableB);

        Thread tA = new Thread(threadA1);
        Thread tB = new Thread(threadB1);
        tA.start();
        tB.start();

    }
}