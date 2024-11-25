package Threading.Thread_Based_Multi_Tasking;


class Food implements Runnable{

//synchronzing the method only.....
//    synchronized public void run(){
//         System.out.println(Thread.currentThread().getName() + " is eating");
//         System.out.println(Thread.currentThread().getName() + " is drinking");
//     }

//synchronizing the block of code only.....
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is eating food");
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + " is eating");
            System.out.println(Thread.currentThread().getName() + " is drinking");
        }
    }

}

public class Race_Condition {
    public static void main(String[] args) {
        Food f = new Food();

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

    }
}
