import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        System.out.println("\nArrayList"
                + "\n\tArrayList<Integer> arrayList = new ArrayList<Integer>();");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.toArray());

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        System.out.println("\nLinkeList"
                + "\n\tLinkedList<Integer> linkedList = new LinkedList<Integer>();");
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.contains(1));
        System.out.println(linkedList.toArray());
        System.out.println();

        System.out.println("\narrayList.toString()");
        System.out.println("\t" + arrayList.toString());

        System.out.println("\nlinkeList.toString()");
        System.out.println("\t" + linkedList.toString());

        System.out.println("\nPolymorphism fun");
    }
}
