package creational.factory.cheesecake.cheesecakes;

public class OriginalCheesecake implements ICheesecake {

    @Override
    public void make_crust() {
        System.out.println("Making crust: " + OriginalCheesecake.class.getSimpleName());
    }

    @Override
    public void add_layers() {
        System.out.println("Adding layers: " + OriginalCheesecake.class.getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking: " + OriginalCheesecake.class.getSimpleName());
    }

    @Override
    public void refrigerate() {
        System.out.println("Refrigerating: " + OriginalCheesecake.class.getSimpleName());
    }

    @Override
    public void add_toppings() {
        System.out.println("Adding toppings" + OriginalCheesecake.class.getSimpleName());
    }
}
