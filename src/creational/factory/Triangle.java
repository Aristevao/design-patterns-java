package factory;

public class Triangle implements Polygon {

    @Override
    public String getDescription() {
        return Triangle.class.getName();
    }
}
