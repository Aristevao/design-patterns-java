package creational.factory.cheesecake.cheesecakes;

public class SmoresCheesecake implements ICheesecake {

    @Override
    public void make_crust() {
        System.out.println("Making crust: " + SmoresCheesecake.class.getSimpleName());
    }

    @Override
    public void add_layers() {
        System.out.println("Adding layers: " + SmoresCheesecake.class.getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking: " + SmoresCheesecake.class.getSimpleName());
    }

    @Override
    public void refrigerate() {
        System.out.println("Refrigerating: " + SmoresCheesecake.class.getSimpleName());
    }

    @Override
    public void add_toppings() {
        System.out.println("Adding toppings" + SmoresCheesecake.class.getSimpleName());
    }
}
