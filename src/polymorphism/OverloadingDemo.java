package polymorphism;

public class OverloadingDemo {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();

        obj.add(2, 3);
        obj.add(2, 3, 4);
    }
}