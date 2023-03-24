package creational.factory.polygon;

public class Square implements Polygon {

    @Override
    public String getDescription() {
        return Square.class.getSimpleName();
    }
}
