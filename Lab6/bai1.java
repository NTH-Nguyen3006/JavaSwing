package Lab6;

public class bai1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Thread 1");
        t1.setPriority(MyThread.MAX_PRIORITY);

        Thread t2 = new MyThread("Thread 2");
        t1.setPriority(1);

        t1.start();
        t2.start();

    }
}
