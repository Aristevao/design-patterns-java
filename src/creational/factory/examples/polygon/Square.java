package creational.factory.examples.polygon;

public class Square implements Polygon {

    @Override
    public String getDescription() {
        return Square.class.getName();
    }
}
