// * 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя


import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class homeS4task2 {
    private static void enqueue(List L, int data) {
        L.add(data);    
    }

    private static int first(List L) {
        int f = (int) L.get(0);
        return f;        
    }

    private static int dequeue(List L) {
        int f = (int) L.get(0);
        L.remove(0);
        return f;        
    }



    public static void main(String[] args) {

        List<Integer> QL = new LinkedList<Integer>();
        enqueue(QL, 10);
        enqueue(QL, 11);
        System.out.println(QL);

        int firstQL = first(QL);
        System.out.println("First in: " +firstQL);

        int firstDequeue = dequeue(QL);
        System.out.println("First in deleted: " +firstDequeue);
        System.out.println(QL);

        
    }
    
}
