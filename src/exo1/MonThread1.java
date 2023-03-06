package exo1;

public class MonThread1 implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                System.out.println("MonThread1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
