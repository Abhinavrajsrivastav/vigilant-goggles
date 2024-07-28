import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {
    public static void main(String[] args) {
        //PriorityQueue

        //Methods of priority queue

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);

        //print the top element of the priority queue
        System.out.println(pq.peek());

        //remove the top element of the priority queue
        System.out.println(pq.poll());

        //offer method
        System.out.println(pq.offer(10));

        //check if the priority queue is em+pty
        System.out.println(pq.isEmpty());
    }
}
