public class LinkedList {
  private Node head;
  private int count;

  LinkedList() {
    head = null;
    count = 0;
  }

  // Insert a new node at the beginning of the list, same as Push
  void insert(int data) {
    Node node = new Node(data);

    if (isEmpty())
      head = node;
    else {
      node.setNext(head);
      head = node;
    }

    count++;
  }

  // Append a new node at the end of the list, same as Enqueue
  void append(int data) {
    Node node = new Node(data);

    if (isEmpty()) { // If the list if empty, then it will fall in the same case as insert
      insert(data);
      return;
    }

    Node last = head; // Find the last node
    while (last.getNext() != null)
      last = last.getNext();

    node.setNext(null);
    last.setNext(node);
    count++;
  }

  // Insert at the specified position
  void insertAt(int data, int pos) {
    if (pos == 0 || isEmpty())
      insert(data);
    else if (pos == Size())
      append(data);
    else {
      Node node = new Node(data);
      Node curr = head;

      for (int i = 1; i < pos && curr.getNext() != null; i++)
        curr = curr.getNext();

      node.setNext(curr.getNext());
      curr.setNext(node);
      count++;
    }
  }

  // Remove the first node
  Node removeHead() {
    if (isEmpty()) {
      System.out.println("empty list.");
      return null;
    }

    Node toRemove = head;
    head = head.getNext();
    count--;

    return toRemove;
  }

  // Remove the last node
  Node removeTail() {
    if (isEmpty()) {
      System.out.println("empty list.");
      return null;
    }

    if (Size() == 1) // Only one node on the list
      return removeHead();

    // Find second last node
    Node secondLast = head;
    while (secondLast.getNext().getNext() != null)
      secondLast = secondLast.getNext();

    // Set the second last node next to null
    Node toRemove = secondLast.getNext();
    secondLast.setNext(null);
    count--;

    return toRemove;
  }

  // Node removeLast() {
  // if (Size() == 0) return null;

  // Node tmp = head;
  // Node pre = head;
  // while (tmp.getNext() != null) {
  // pre = tmp;
  // tmp = tmp.getNext();
  // }

  // tail = pre;
  // tail.setNext(null);
  // count--;

  // if (Size() == 0) head = tail = null;

  // return tmp;
  // }

  // Remove at the specified position
  Node removeAt(int pos) {
    if (isEmpty()) {
      System.out.println("empty list.");
      return null;
    }

    if (pos == 0) // Only one node
      return removeHead();
    else if (pos == Size()) // Remove last node
      return removeTail();
    else if (pos > 0 && pos < Size()) {
      Node curr = head;

      for (int i = 1; i < pos; i++)
        curr = curr.getNext();

      Node toRemove = curr.getNext();
      curr.setNext(toRemove.getNext());
      count--;

      return toRemove;
    } else {
      System.out.println("position not valid.");
      return null;
    }
  }

  Node getHead() {
    return head;
  }

  void setHead(Node node) {
    head = node;
  }

  int Size() {
    return count;
  }

  boolean isEmpty() {
    return head == null;
  }

  void Print() {
    if (isEmpty()) {
      System.out.println("empty list.");
      return;
    }

    Node curr = head;

    System.out.println("LL Head: " + head.getData() + "\tLL Size: " + Size() + "\n");
    while (curr != null) {
      System.out.println("Node data: " + curr.getData() + "\tNode next: "
          + (curr.getNext() != null ? curr.getNext().getData() : "null"));
      curr = curr.getNext();
    }
  }
}
