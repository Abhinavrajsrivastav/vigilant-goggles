package Threading.Thread_Based_Multi_Tasking;

class Library implements Runnable {
    public void run() {
        // Resources
        String book1 = "Java";
        String book2 = "SQL";
        String book3 = "Data Science";

        try {
            if (Thread.currentThread().getName().equals("Ram")) {
                Thread.sleep(3000);
                synchronized (book1) {
                    System.out.println("Ram has acquired the Java Book");
                    System.out.println(Thread.NORM_PRIORITY);
                    Thread.sleep(3000);
                    synchronized (book2) {
                        System.out.println("Ram has acquired SQL book");
                        Thread.sleep(3000);
                        synchronized (book3) {
                            System.out.println("Ram has acquired Data Science book");
                            Thread.sleep(3000);
                        }
                    }
                }
            } else{
                Thread.sleep(3000);
                synchronized (book3) {
                    System.out.println("Shyam has acquired the Data Science Book");
                    Thread.sleep(3000);
                    synchronized (book2) {
                        System.out.println("Shyam has acquired SQL book");
                        Thread.sleep(3000);
                        synchronized (book1) {
                            System.out.println("Shyam has acquired Java book");
                            Thread.sleep(3000);
                        }
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class DeadLocak_prevention {
    public static void main(String[] args) {
        Library l = new Library();

        // Two different threads
        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);

        // Setting the name of the threads
        t1.setName("Ram");
        t2.setName("Shyam");

        // Threads going in Runnable state
        t1.start();
        t2.start();


        //1. Ram has accquired the SQL book and want Data Science book
        //2. Shyam has accquired the Data Science book and want SQL Book
        //Mutual dependency of resource occures - deadloack occurs
    }
}
