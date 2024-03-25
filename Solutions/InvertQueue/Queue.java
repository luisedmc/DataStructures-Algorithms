public class Queue {
  private char data[];
  private int first;
  private int last;
  private int count;
  private int capacity;

  public Queue(int size) {
    data = new char[size];
    first = 0;
    last = 0;
    count = 0;
    capacity = size;
  }

  public void Enqueue(char c) {
    if (isFull())
      return;
    data[last++] = c;
    count++;
  }

  public char Dequeue() {
    if (isEmpty()) return ' ';

    char c = data[first];
    data[first] = '\0';
    first = (first + 1) % capacity;
    count--;

    return c;
  }

  public char Peek() {
    if (isEmpty()) return ' ';
    return data[first];
  }

  public int Size() {
    if (isEmpty()) return 0;
    return capacity;
  }

  private Boolean isFull() {
    return count == capacity;
  }

  private Boolean isEmpty() {
    return count == 0;
  }

  public void Print() {
    if (isEmpty())
      return;

    System.out.println("Printing Queue: ");
    System.out.println("First: " + Peek());
    for (int i = first; i < last; i++)
      System.out.print(data[i] + " ");
  }
}
