// Luis Eduardo Meduna - 42203341

public class App {
    public static void main(String[] args) throws Exception {
        Inverter i = new Inverter(5);

        i.q.Enqueue('a');        
        i.q.Enqueue('b');        
        i.q.Enqueue('c');        
        
        i.Invert();
        i.PrintStackAndQueue();
    }
}
