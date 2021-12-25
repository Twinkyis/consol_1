package MVC;

public class ConsolView implements IView {


    public void showStudent(Model model) {
        System.out.println("Student_View " + model.getName() + "A to sho vot massive" + model.getArr());
    }
}
