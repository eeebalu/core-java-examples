class Hi extends Thread {
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Hello implements Runnable {
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadsTest {
    public static void main(String[] args) {
        Hi obj = new Hi();
        Runnable obj1 = new Hello();

        Thread t1 = new Thread(obj1);
        System.out.println(obj.getPriority());
        System.out.println(t1.getPriority());
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj.getPriority());
        System.out.println(t1.getPriority());
        obj.start();
        t1.start();
    }
}
