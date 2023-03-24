package creational.factory.cheesecake;

public class CheesecakeMain {
    public static void main(String[] args) throws IllegalAccessException {
        CheesecakeFactory.makeCheesecake("Original");
        System.out.println();
        CheesecakeFactory.makeCheesecake("Coffee");
    }

    /*
    BAD EXAMPLE
    static void makeCheesecake(String type) {
    Cheesecake cheesecake;
    switch (type) {
    case "oreo":
    cheesecake = new OreoCheesecake();
    break;
    case "coffee":
    cheesecake = new CoffeeCheesecake();
    break;
    case "tiramisu":
    cheesecake = new TiramisuCheesecake();
    break;
    case "smores":
    cheesecake = new SmoresCheesecake();
    break;
    case "hazelnut":
    cheesecake = new HazelnutCheesecake();
    break;

    default:
    cheesecake = new OriginalCheesecake();
    break;
    }

    cheesecake.make_crust();
    cheesecake.add_layers();
    cheesecake.bake();
    cheesecake.refrigerate();
    cheesecake.add_toppings();
    }
    */
}
