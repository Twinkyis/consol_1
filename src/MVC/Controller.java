package MVC;

public class Controller {
    Interface P_interface = new DBModel();
    IView iView = new ConsolView();
    void execute() {
        Model model = P_interface.getModel();
        iView.show(model);
    }
}
