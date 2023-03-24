package creational.factory.polygon;

public class Pentagon implements Polygon {

    @Override
    public String getDescription() {
        return Pentagon.class.getSimpleName();
    }
}
