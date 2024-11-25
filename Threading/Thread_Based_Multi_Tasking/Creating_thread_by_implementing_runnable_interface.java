package Threading.Thread_Based_Multi_Tasking;
//lies in java.lang pacakages


class Cat implements Runnable{
    public void run(){
        System.out.println("Meow");
    }
}

class Dog implements Runnable{
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Bark");
        }
        System.out.println("\n");
    }
}


public class Creating_thread_by_implementing_runnable_interface {
    public static void main(String[] args) {
        
        //thread -1
        Dog dog = new Dog();
        Thread t1 = new Thread(dog);
        //registering thread to Thread Scheduler
        t1.start();
        
        //thread -2
        Cat cat = new Cat();
        Thread t2 = new Thread(cat);
        t2.start();
        //if there is a delays, TS will switch to another thread(Line - 12 )
        //more better than the extendign the thread class
    }
}
