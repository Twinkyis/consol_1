package MVC;

public class DBModel implements Interface{

    @Override
    public Model getModel() {
        return new Model();
    }
}
