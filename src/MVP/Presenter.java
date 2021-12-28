package MVP;

public class Presenter {
    Button button;
    Model_Button model_button;

        public Presenter(Button button, Model_Button model_button) {
            this.button = button;
            this.model_button = model_button;
        }

    void pclick(){
        if (button.click == false) {
            model_button.clickOff();
        } else if(button.click == true) {
            model_button.clickOn();
        }
    }
}
