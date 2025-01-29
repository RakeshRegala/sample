// Using Runnable interface
class GoodMorningRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("GoodMorningRunnable interrupted");
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("HelloRunnable interrupted");
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Welcome");
                Thread.sleep(3000); // 3 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("WelcomeRunnable interrupted");
        }
    }
}

public class Exercise7A2 {
    public static void main(String[] args) {
        GoodMorningRunnable goodMorningRunnable = new GoodMorningRunnable();
        HelloRunnable helloRunnable = new HelloRunnable();
        WelcomeRunnable welcomeRunnable = new WelcomeRunnable();

        // Creating Thread instances
        Thread t1 = new Thread(goodMorningRunnable);
        Thread t2 = new Thread(helloRunnable);
        Thread t3 = new Thread(welcomeRunnable);

        t1.start();
        t2.start();
        t3.start();
    }
}
