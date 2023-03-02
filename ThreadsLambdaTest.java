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
public class ThreadsLambdaTest {
    public static void main(String[] args) {
        Runnable obj = () -> 
            {
                for(int i=0; i<10; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        Runnable obj1 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj);
        t2.start();
        t1.start();
    }
}
