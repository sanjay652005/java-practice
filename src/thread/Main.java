package thread;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new NumberTask(1, 5), "Thread-1");
        Thread t2 = new Thread(new NumberTask(6, 10), "Thread-2");

        t1.start();
        t2.start();
    }
}