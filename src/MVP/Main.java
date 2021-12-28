package MVP;

public class Main {
    public static void main(String[] args) {

        Button button = new Button(true);
        Model_Button model_button = new Model_Button();
        Presenter presenter = new Presenter(button, model_button);
        presenter.pclick();
    }
}
