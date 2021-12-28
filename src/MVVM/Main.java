package MVVM;

public class Main {
    public static void main(String[] args) {

        Button button = new Button(false);
        Model_Button model_button = new Model_Button();
        View_Model view_model = new View_Model(model_button, button);
        button.Button1(view_model);
        view_model.doing();

    }
}
