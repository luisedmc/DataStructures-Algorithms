public class Stack {
    private int data[];
    private int top;
    private int capacity;

    Stack(int size) {
        data = new int[size];
        top = -1;
        capacity = size;
    }

    public void Push(int n) {
        if (isFull()) return;
        data[++top] = n;
    }

    public int Pop() {
        if (isEmpty()) return -1;
        int r = data[top];
        top--;

        return r;
    }

    public int Peek() {
        if (isEmpty()) return -999;
        return data[top];
    }

    public void StackClear() {
        if (isEmpty()) return;
        while (!isEmpty()) Pop();
    }

    public boolean StackContains(int n) {
        if (isEmpty()) return false;
        for (int i = 0; i <= top; i++) {
            if (data[i] == n) return true;
        }

        return false;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void Print() {
        if (isEmpty()) return;
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
