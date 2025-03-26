package Lab6;

public class TestThread_bai3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new OddThread();
        t1.start();
        t1.join();
        new EvenThread().start();

    }
}

class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 11; i+=2) {
            System.out.println("Số lẻ: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i < 11; i+=2) {
            System.out.println("Số chẵn: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
