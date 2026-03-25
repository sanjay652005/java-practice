package encapsulation;

public class Animal {

    public void run() {
        System.out.println("animal running");
    }

    public void jump() {
        System.out.println("animal jumping");
    }

    public static void main(String[] args) {

        Deer d = new Deer();
        d.longjump();
        d.run();
        d.jump();

       

        Animal a = new Animal();
        a.run();
        a.jump();
    }
}
