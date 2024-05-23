public class DoublyCircularLL {
  private Node head, tail;
  private int size;

  DoublyCircularLL() {
    head = tail = null;
    size = 0;
  }

  public void Insert(int data) {
    Node newNode = new Node(data);

    if (isEmpty()) {
      head = tail = newNode;
      head.setNext(head);
      head.setPrevious(tail);
    } else {
      tail.setNext(newNode);
      newNode.setPrevious(tail);
      newNode.setNext(head);
      head.setPrevious(newNode);
      tail = newNode;
    }

    size++;
  }

  public Node Remove() {
    if (isEmpty()) return null;

    Node temp = head;

    if (head == tail) {
      head = tail = null;
    } else {
      head = head.getNext();
      head.setPrevious(tail);
      tail.setNext(head);
    }

    size--;
    return temp;
  }

  public void Change(int data, int newData) {
    Node temp = head;

    for (int i = 0; i < size; i++) {
      if (temp.getData() == data) {
        temp.setData(newData);
        return;
      }
      temp = temp.getNext();
    }
  }

  public boolean Search(int data) {
    Node temp = head;

    for (int i = 0; i < size; i++) {
      if (temp.getData() == data) return true;
      temp = temp.getNext();
    }

    return false;
  }

  private boolean isEmpty() {
    return head == null && tail == null;
  }

  public void Print() {
    Node temp = head;

    for (int i = 0; i < size; i++) {
      System.out.print(temp.getData() + " ");
      temp = temp.getNext();
    }
    System.out.println();
  }
}