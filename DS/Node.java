public class Node {
  private int data;
  private Node next, prev;

  Node(int value) {
    data = value;
    next = prev = null;
  }

  int getData() {
    return data;
  }

  void setData(int v) {
    data = v;
  }

  Node getNext() {
    return next;
  }

  void setNext(Node node) {
    next = node;
  }

  Node getPrevious() {
    return prev;
  }

  void setPrevious(Node node) {
    prev = node;
  }
}