import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {
        java.util.List<Integer> list = new ArrayList<>();
        int size = 10000000;

        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        // For-each loop
        long startTime = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("for-each loop: " + (endTime - startTime));

        // Classic for loop
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for loop (list.size()): " + (endTime - startTime));

        // Pre-calculated size
        int sizePre = list.size();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < sizePre; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for loop (pre-calculated size): " + (endTime - startTime));

        // Classic for loop from end to start
        startTime = System.currentTimeMillis();
        for (int i = size - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for loop (from end to start): " + (endTime - startTime));

        // Iterator
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterator: " + (endTime - startTime));

        // ListIterator from start to end
        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator (from start to end): " + (endTime - startTime));

        // ListIterator from end to start
        startTime = System.currentTimeMillis();
        listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            int temp = listIterator.previous();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator (from end to start): " + (endTime - startTime));
    }
}
