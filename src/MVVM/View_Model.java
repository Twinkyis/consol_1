package MVVM;

public class View_Model {

    Button button;
    Model_Button model_button;



    public View_Model(Model_Button model_button, Button button) {
        this.model_button = model_button;
        this.button = button;
    }

    void doing (){
        if (button.click == true) {
            model_button.clickOn();
        } else if (button.click == false) {
            model_button.clickOff();
        }
    }



}
