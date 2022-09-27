package kvbdev;

public class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        final String threadName = Thread.currentThread().getName();
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я поток " + threadName + ". Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }

}
