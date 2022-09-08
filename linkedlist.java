import java.util.LinkedList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args){
        LinkedList<Character> ll = new LinkedList<Character>();
        ll.add('B');
        ll.add('E');
        ll.add('F');
        System.out.println("Original contents:"+ll);
        ll.addLast('G');
        ll.addFirst('A');
        System.out.println("\nAfter calls to addFirst() and addLast().");
        System.out.println("Contents:" + ll);
        ll.add(2,'D');
        ll.add(2,'C');
        System.out.println("\nAfter insertions");
        System.out.println("Contents:"+ll);
        System.out.println("\nHere are the first and last elements:"+ll.getFirst() + " " + ll.getLast());
        List<Character> sub=ll.subList(2,5);
        System.out.println("\nContents of sublist view:"+sub);
        LinkedList<Character> ll2=new LinkedList<Character>(sub);
        ll.removeAll(ll2);
        System.out.println("\nAfter removing ll2 from ll1.");
        System.out.println("Contents:"+ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("\nAfter deleting first and last element:");
        System.out.println("contents:"+ll);
        ll.set(0,Character.toLowerCase(ll.get(0)));
        System.out.println("\nAfter change:"+ll);


    }
    
}
