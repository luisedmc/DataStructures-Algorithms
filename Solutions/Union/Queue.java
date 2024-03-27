public class Queue {
  public int data[];
  private int last;
  private int count;
  private int capacity;

  Queue(int size) {
    data = new int[size];
    last = 0;
    count = 0;
    capacity = size;
  }

  public void Enqueue(int n) {
    if (isFull())
      return;
    data[last++] = n;
    count++;
  }

  public void Sort() {
    for (int i = 0; i < last; i++) {
      for (int j = i + 1; j < last; j++) {
        if (data[i] > data[j]) {
          int temp = data[i];
          data[i] = data[j];
          data[j] = temp;
        }
      }
    }
  }

  public void Print() {
    for (int i = 0; i < last; i++)
      System.out.print(data[i] + " ");
  }

  private Boolean isFull() {
    return count == capacity;
  }
}
