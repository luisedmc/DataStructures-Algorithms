public class Stack {
  private char data[];
  private int top;

  public Stack(int size) {
    data = new char[size];
    top = -1;
  }

  public void Push(char c) {
    data[++top] = c;
  }

  public char Top() {
    if (isEmpty())
      return ' ';
    return data[top];
  }

  private Boolean isEmpty() {
    return top == -1;
  }

  public void Print() {
    if (isEmpty())
      return;

    System.out.println("Printing Stack: ");
    System.out.println("Top: " + Top());
    for (int i = 0; i <= top; i++)
      System.out.print(data[i] + " ");
  }
}
