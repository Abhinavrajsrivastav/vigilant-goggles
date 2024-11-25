package Queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq.offer(10));

        System.out.println(pq.isEmpty());
    }
}


///Priority Queue - A priority queue is a special type of queue in which each element is associated
///  with a priority and is served according to its priority. 

