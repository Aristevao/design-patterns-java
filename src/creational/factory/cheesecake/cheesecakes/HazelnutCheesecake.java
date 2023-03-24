package creational.factory.cheesecake.cheesecakes;

public class HazelnutCheesecake implements ICheesecake {

    @Override
    public void make_crust() {
        System.out.println("Making crust: " + HazelnutCheesecake.class.getSimpleName());
    }

    @Override
    public void add_layers() {
        System.out.println("Adding layers: " + HazelnutCheesecake.class.getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking: " + HazelnutCheesecake.class.getSimpleName());
    }

    @Override
    public void refrigerate() {
        System.out.println("Refrigerating: " + HazelnutCheesecake.class.getSimpleName());
    }

    @Override
    public void add_toppings() {
        System.out.println("Adding toppings" + HazelnutCheesecake.class.getSimpleName());
    }
}
