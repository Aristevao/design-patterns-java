package creational.factory.examples.polygon;

public class FactoryApplication {
    public static void main(String[] args) {
        Polygon triangle = PolygonFactory.createPolygon(3);
        System.out.printf("%s - %s%n", 3, triangle.getDescription());

        Polygon square = PolygonFactory.createPolygon(4);
        System.out.printf("%s - %s%n", 4, square.getDescription());

        Polygon pentagon = PolygonFactory.createPolygon(5);
        System.out.printf("%s - %s%n", 5, pentagon.getDescription());
    }
}
