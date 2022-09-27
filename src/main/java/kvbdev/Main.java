package kvbdev;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final int MAX_THREADS = 4;
        final long MAIN_SLEEP = 15_000;

        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup1");

        System.out.println("Создаю потоки...");
        for (int i = 0; i < MAX_THREADS; i++) {
            new MyThread(threadGroup, "MyThread" + i).start();
        }

        Thread.sleep(MAIN_SLEEP);

        System.out.println("Завершаю все потоки.");
        threadGroup.interrupt();
    }

}
