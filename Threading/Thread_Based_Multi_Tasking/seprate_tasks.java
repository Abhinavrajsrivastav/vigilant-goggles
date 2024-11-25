package Threading.Thread_Based_Multi_Tasking;

class seprate_tasks {
    public static void main(String[] args) {
        int n = 5;

        //Before changing the name and priority of main thread...
        //Get the name of thread
        String name = Thread.currentThread().getName();
        System.out.println("Current Thread: " + name);

        //get the priority of main thread
        int priority = Thread.currentThread().getPriority();
        System.out.println("Priority: " + priority);


        //Change the name and priority of main thread...
        //Change the name of main thread
        Thread.currentThread().setName("Main Thread");
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        //Change the priority of main thread
        Thread.currentThread().setPriority(10);
        System.out.println("Priority: " + Thread.currentThread().getPriority());



        System.out.println("Task 1");
        for(int i = 0;i<n;i++){
            System.out.println("*");
        }

        System.out.println("Task 2");
        for(int i = 0;i<n;i++){
            System.out.println("#");
        }

        System.out.println("Task 3");
        for(int i = 0;i<n;i++){
            System.out.println("$");
        }
    }
}