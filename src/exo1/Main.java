package exo1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new MonThread1()).start();
        while (true) {
            Thread.sleep(10);
            System.out.println("Hello world!");
        }
    }
}