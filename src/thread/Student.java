package thread;

import java8.MyInterface;

public class Student implements Runnable, MyInterface {

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    @Override
    public void sayhello() {
        System.out.println("Hello from MyInterface");
    }

    public static void main(String[] args) {

        Student s = new Student();

        Thread t1 = new Thread(s, "Thread-A");
        Thread t2 = new Thread(s, "Thread-B");
        Thread t3 = new Thread(s, "Thread-C");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        s.sayhello();
    }
}