public class AnnonymousInner {
    public static void main(String[] args) {
        // Creating an object of an anonymous class
        Thread t = new Thread() {
            public void run() {
                System.out.println("Child Thread");
            }
        };
        t.start();
        System.out.println("Main Thread");
    }
}
