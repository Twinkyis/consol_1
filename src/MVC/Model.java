package MVC;

public class Model {

    String name = "Bob";
    int size = 404;
    int [] arr = {12,4,3,22,5};

    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }




}
