public class Inverter {
  private Stack s;
  public Queue q;

  public Inverter(int size) {
    s = new Stack(size);
    q = new Queue(size);
  }

  public void Invert() {
    for (int i = 0; i < q.Size(); i++) {
      s.Push(q.Dequeue());
    }
  }

  public void PrintStackAndQueue() {
    q.Print();
    s.Print();
  }
}
