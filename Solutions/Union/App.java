public class App {
    public static void main(String[] args) throws Exception {
        Union u = new Union(3);
        u.q1.Enqueue(1);
        u.q1.Enqueue(3);
        u.q1.Enqueue(5);

        System.out.print("Queue1: ");
        u.q1.Print();

        u.q2.Enqueue(2);
        u.q2.Enqueue(4);
        u.q2.Enqueue(6);

        System.out.print("\nQueue2: ");
        u.q2.Print();

        u.SortQueues();
        u.PrintSortedQueue();
    }
}
