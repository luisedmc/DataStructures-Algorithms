public class CircularLinkedList {
  private Node head, tail;
  private int data;
  private int count;

  CircularLinkedList() {
    head = tail = null;
    count = 0;
  }

  // Insert a new node at the beginning of the list, same as Push
  void insert(int data) {
    Node node = new Node(data);

    if (isEmpty())
      tail = node;
    else
      node.setNext(head);

    head = node;
    tail.setNext(head); // Circular
    count++;
  }

  // Append a new node at the end of the list, same as Enqueue
  void append(int data) {
    Node node = new Node(data);

    if (isEmpty())
      head = tail = node;
    else {
      tail.setNext(node);
      tail = node;
    }

    tail.setNext(head); // Circular
    count++;
  }

  // Insert a new node after the specified
  void insertAfter(int data, int after) {
    // Search the 'after' node
    Node curr = head;
    do {
      if (curr.getData() == after) {
        break;
      }
      curr = curr.getNext();
    } while (curr != head);

    if (curr.getData() != after) {
      return;
    }

    Node n = new Node(data);
    n.setNext(curr.getNext());
    curr.setNext(n);

    // Update tail reference if new node is the last
    if (curr == tail) {
      tail = n;
      tail.setNext(head);
    }

    count++;
  }

  Node getHead() {
    return head;
  }

  Node getTail() {
    return tail;
  }

  private int Size() {
    return count;
  }

  private boolean isEmpty() {
    return head == null && tail == null && count == 0;
  }

  void Print() {
    if (isEmpty()) {
      System.out.println("empty list.");
      return;
    }

    Node curr = head;

    System.out.println("LL Head: " + head.getData() + "\tLL Tail: " + tail.getData() + "\tLL Size: " + Size() + "\n");
    do {
      System.out.println("Node data: " + curr.getData() + "\tNode next: "
          + (curr.getNext() != null ? curr.getNext().getData() : "null"));
      curr = curr.getNext();
    } while (curr != head);
  }
}
