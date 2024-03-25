public class Stack {
  private char data[];
  private int top;
  private int capacity;

  public Stack(int size) {
    data = new char[size];
    top = -1;
    capacity = size;
  }

  public void Push(char c) {
    if (isFull())
      return;
    data[++top] = c;
  }

  public char Pop() {
    if (isEmpty())
      return ' ';
    return data[top--];
  }

  public char Top() {
    if (isEmpty()) return ' ';
    return data[top];
  }

  public Boolean isFull() {
    return top == capacity - 1;
  }
  
  public Boolean isEmpty() {
    return top == -1;
  }

  public int Size() {
    return capacity;
  }

  public void Print() {
    for (int i = 0; i <= top; i++)
      System.out.print(data[i] + " ");
  }
}
