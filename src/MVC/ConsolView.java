package MVC;

public class ConsolView implements IView {


    public void show(Model model) {
        System.out.println("View name - " + model.getName() + ", size - " + model.getArr() + " " + model.getSize());
    }
}
