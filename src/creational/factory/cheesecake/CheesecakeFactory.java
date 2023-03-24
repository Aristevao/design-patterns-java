package creational.factory.cheesecake;

import creational.factory.cheesecake.cheesecakes.CoffeeCheesecake;
import creational.factory.cheesecake.cheesecakes.HazelnutCheesecake;
import creational.factory.cheesecake.cheesecakes.ICheesecake;
import creational.factory.cheesecake.cheesecakes.OreoCheesecake;
import creational.factory.cheesecake.cheesecakes.OriginalCheesecake;
import creational.factory.cheesecake.cheesecakes.SmoresCheesecake;
import creational.factory.cheesecake.cheesecakes.TiramisuCheesecake;

public class CheesecakeFactory {
    public static ICheesecake createCheesecake(String type) throws IllegalAccessException {
        switch (type.toLowerCase()) {
            case "oreo":
                return new OreoCheesecake();
            case "coffee":
                return new CoffeeCheesecake();
            case "tiramisu":
                return new TiramisuCheesecake();
            case "smores":
                return new SmoresCheesecake();
            case "hazelnut":
                return new HazelnutCheesecake();
            case "original":
                return new OriginalCheesecake();
            default:
                throw new IllegalAccessException("Cheesecake type does not exist: " + type);
        }
    }

    public static void makeCheesecake(String type) throws IllegalAccessException {
        ICheesecake factory = CheesecakeFactory.createCheesecake(type);
        factory.make_crust();
        factory.add_layers();
        factory.bake();
        factory.refrigerate();
        factory.add_toppings();
    }
}
