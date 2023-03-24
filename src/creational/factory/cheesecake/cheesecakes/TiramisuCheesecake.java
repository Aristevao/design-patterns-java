package creational.factory.cheesecake.cheesecakes;

public class TiramisuCheesecake implements ICheesecake {

    @Override
    public void make_crust() {
        System.out.println("Making crust: " + TiramisuCheesecake.class.getSimpleName());
    }

    @Override
    public void add_layers() {
        System.out.println("Adding layers: " + TiramisuCheesecake.class.getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking: " + TiramisuCheesecake.class.getSimpleName());
    }

    @Override
    public void refrigerate() {
        System.out.println("Refrigerating: " + TiramisuCheesecake.class.getSimpleName());
    }

    @Override
    public void add_toppings() {
        System.out.println("Adding toppings" + TiramisuCheesecake.class.getSimpleName());
    }
}
