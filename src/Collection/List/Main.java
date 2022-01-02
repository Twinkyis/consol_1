package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


//  коллекция Array ================================================================
        ArrayList<String> numPhone = new ArrayList<>();
        numPhone.add("Monica");
        numPhone.add("Chandler");
        numPhone.add("Ross");
        numPhone.add("Rachel");
        numPhone.add("Joe");
        numPhone.add("Phoebe");

        System.out.println(numPhone);





//==================================================================================


// колекция LinkedList =============================================================
        String n1 = new String("n1");
        String n2 = new String("n2");
        String n3 = new String("n3");
        String n4 = new String("n4");

        LinkedList<String> test02 = new LinkedList<>();
        test02.add(n1);
        test02.add(n2);
        test02.add(n3);
        test02.add(n4);
        System.out.println(test02);
//===================================================================================
    }
}
