package creational.factory.examples.polygon;

public class Triangle implements Polygon {

    @Override
    public String getDescription() {
        return Triangle.class.getSimpleName();
    }
}
