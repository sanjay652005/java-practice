package thread;

public class NumberTask implements Runnable {

    private int start;
    private int end;

    // Constructor
    public NumberTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); // pause
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}