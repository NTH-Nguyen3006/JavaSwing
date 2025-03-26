package Lab6;

public class MyThread extends Thread  {
    public final static int MAX_PRIORITY = 10;
    public final static int MIN_PRIORITY = 1;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(super.getName() + " ... " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}