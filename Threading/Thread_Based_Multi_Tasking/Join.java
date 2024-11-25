package Threading.Thread_Based_Multi_Tasking;
public class Join {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 interrupted");
                }
            }
        });

        thread1.start();
        thread2.start(); 

        try {
            thread1.join(); // Wait for thread 1 to finish
            thread2.join(); // Wait for thread 2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting");
    }
}


//Join Method -  It is used to pause the current thread execution until unless the specified thread is dead.