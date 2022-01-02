package Collection.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<String> test02 = new TreeSet<>();
        test02.add("044-44-44");
        test02.add("044-55-55");
        test02.add("144-66-66");
        test02.add("055-55-55");
        for (Object o : test02) {
            System.out.println(o);
        }
        System.out.println(test02.first());
    }
}

abstract class test02 implements Comparable {
    int num;

    public test02(int num) {
        this.num = num;
    }

    public int compareTo(test02 t) {
        if (t.num > this.num) {
            return this.num - t.num;
        }
        return 0;
    }
}
