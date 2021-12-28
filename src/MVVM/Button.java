package MVVM;

public class Button {

    boolean click;
    View_Model view_model;
    public Button (boolean click) {this.click = click;}


    void Button1(View_Model view_model) {
        this.view_model = view_model;
    }
}