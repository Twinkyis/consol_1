package Map.Hash;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<Integer, String> phoneNum = new HashMap<>();

        phoneNum.put(001223255, "Ann");
        phoneNum.put(005554466, "Peter");
        phoneNum.put(443336688, "Bob");
        phoneNum.put(555344422, "Alex");
        phoneNum.put(443336688, "Sam");

        String Annname = phoneNum.get(001223255);
        System.out.println(Annname);

        System.out.println(phoneNum);

        phoneNum.remove(43336688);
        System.out.println(phoneNum);
    }
}
