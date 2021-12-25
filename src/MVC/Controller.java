package MVC;

public class Controller {
    Interface Iinterface = new DBModel();
    IView iView = new ConsolView();
    void execute() {
        Model model = Iinterface.getModel();
        iView.showStudent(model);
    }
}
