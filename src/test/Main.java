package test;

public class Main {
    public static void main(String[] args) {

        Aa c = new Aa(true);
        c.Fool();

    }
}
class Aa {
    boolean A;
       public Aa (boolean A) {this.A = A;}


        void Fool(){
        if (A == true) {
            System.out.println("OOOoooOppps");
        }
        else if (A == false) {
            System.out.println("fail");
        }
    }
}

