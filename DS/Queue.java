public class Queue {
    private int data[];
    private int first;
    private int last;
    private int capacity;

    Queue(int size) {
        data = new int[size];
        first = last = 0;
        capacity = size;
    }

    public void Enqueue(int n) {
        if (isFull()) return;
        data[last++] = n;
    }

    public int Dequeue() {
        if (isEmpty()) return -999;

        int temp = data[first];
        first++;

        return temp;
    }

    public int Front() {
        if (isEmpty()) return 0;
        return data[first];
    }

    public boolean QueueContains(int n) {
        if (isEmpty()) return false;

        for (int i = first; i < last; i++) {
            if (data[i] == n) return true;
        }

        return false;
    }

    public void QueueClear() {
        if (isEmpty()) return;

        while(!isEmpty()) Dequeue();
    }

    public boolean isFull() {
        return last == capacity;
    }

    public boolean isEmpty() {
        return first == last;
    }

    public void Print() {
        for (int i = first; i < last; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
