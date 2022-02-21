package ua.com.alevel.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public void test() {
        int size = 100_000;
        List<Integer> arrayList = new ArrayList<>(size);
        List<Integer> linkedList = new LinkedList<>();

        // add
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis() - start;
//        System.out.println("arrayList add finish = " + end);

        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis() - start;
//        System.out.println("linkedList add finish = " + end);

        // get
//        start = System.currentTimeMillis();
//        for (int i = 0; i < size; i++) {
//            arrayList.get(i);
//        }
//        end = System.currentTimeMillis() - start;
//        System.out.println("arrayList get finish = " + end);

//        start = System.currentTimeMillis();
//        for (int i = 0; i < size; i++) {
//            linkedList.get(i);
//        }
//        end = System.currentTimeMillis() - start;
//        System.out.println("linkedList get finish = " + end);

        // remove
        start = System.currentTimeMillis();
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            arrayListIterator.next();
            arrayListIterator.remove();
        }
        end = System.currentTimeMillis() - start;
        System.out.println("arrayList remove finish = " + end);

        start = System.currentTimeMillis();
        Iterator<Integer> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            linkedListIterator.next();
            linkedListIterator.remove();
        }
        end = System.currentTimeMillis() - start;
        System.out.println("linkedList remove finish = " + end);
    }
}
