// Class for the Daemon Thread
class DaemonThread extends Thread {
    public void run() {
        // Infinite loop to simulate a background task
        while (true) {
            try {
                System.out.println("Daemon Thread is running in the background...");
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Daemon Thread interrupted.");
            }
        }
    }
}

// Class for the User Thread
class UserThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("User Thread is running...");
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("User Thread interrupted.");
            }
        }
        System.out.println("User Thread finished execution.");
    }
}

// Main class to test the program
public class DaemonThreadExample {
    public static void main(String[] args) {
        // Creating and starting the daemon thread
        DaemonThread daemon = new DaemonThread();
        daemon.setDaemon(true);  // Set as daemon thread
        daemon.start();

        // Creating and starting the user thread
        UserThread user = new UserThread();
        user.start();

        // The program will end after the user thread completes
    }
}
