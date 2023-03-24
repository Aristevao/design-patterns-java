package creational.factory.cheesecake.cheesecakes;

public class CoffeeCheesecake implements ICheesecake {

    @Override
    public void make_crust() {
        System.out.println("Making crust: " + CoffeeCheesecake.class.getSimpleName());
    }

    @Override
    public void add_layers() {
        System.out.println("Adding layers: " + CoffeeCheesecake.class.getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking: " + CoffeeCheesecake.class.getSimpleName());
    }

    @Override
    public void refrigerate() {
        System.out.println("Refrigerating: " + CoffeeCheesecake.class.getSimpleName());
    }

    @Override
    public void add_toppings() {
        System.out.println("Adding toppings" + CoffeeCheesecake.class.getSimpleName());
    }
}
