package creational.factory.cheesecake.cheesecakes;

public class OreoCheesecake implements ICheesecake {

    @Override
    public void make_crust() {
        System.out.println("Making crust: " + OreoCheesecake.class.getSimpleName());
    }

    @Override
    public void add_layers() {
        System.out.println("Adding layers: " + OreoCheesecake.class.getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking: " + OreoCheesecake.class.getSimpleName());
    }

    @Override
    public void refrigerate() {
        System.out.println("Refrigerating: " + OreoCheesecake.class.getSimpleName());
    }

    @Override
    public void add_toppings() {
        System.out.println("Adding toppings" + OreoCheesecake.class.getSimpleName());
    }
}
