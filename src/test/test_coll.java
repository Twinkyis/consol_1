package test;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class test_coll {
    public static void main(String[] args) {
        Queue collection = new PriorityQueue();
        collection.offer("1");
        collection.offer("2");
        collection.offer("3");
        Iterator iterator = collection.iterator();
        while (Iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        for (int i = 0; i <= collection.size() + 1; i++) {
//            System.out.println(collection.poll());
//        }
        System.out.println("num " + collection.size());
    }
}
