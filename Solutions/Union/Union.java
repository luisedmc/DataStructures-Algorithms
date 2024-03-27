public class Union {
  public Queue q1;
  public Queue q2;
  private Queue sortedQueue;

  Union(int size) {
    q1 = new Queue(size);
    q2 = new Queue(size);
    sortedQueue = new Queue(size * 2);
  }

  public void SortQueues() {
    for (int i = 0; i < q1.data.length; i++)
      sortedQueue.Enqueue(q1.data[i]);

    for (int i = 0; i < q2.data.length; i++)
      sortedQueue.Enqueue(q2.data[i]);

    sortedQueue.Sort();
  }

  public void PrintSortedQueue() {
    System.out.print("\nSorted Queue: ");
    sortedQueue.Print();
  }
}
