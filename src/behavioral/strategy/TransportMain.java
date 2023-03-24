package behavioral.strategy;

public class TransportMain {
    public static void main(String[] args) {
        /*
         * Strategy Design pattern enables an algorithm’s behavior to be selected at
         * runtime. The pattern:
         * - Defines a family of algorithms
         * - Encapsulates each algorithm
         * - Makes the algorithms interchangeable within that family.
         */

        /*
         * Example: if/elseif/elseif
         * The problem with this design is it will always affect the business logic
         * implementation whenever we need to add or modify any mode of transport.
         */
        String mode = "BUS";
        if (mode.equals("BUS")) {
            System.out.println("User opted to go by bus");
        } else if (mode.equals("CAR")) {
            System.out.println("User opted to go by car");
        } else if (mode.equals("TAXI")) {
            System.out.println("User opted to go by taxi");
        }

        /*
         * Refactor if/elseif/elseif using Strategy
         * Pros :
         * 1. Adding a new strategy will never disturb any previous code.
         * 2. Removal/Refactoring of any previous strategy is flexible.
         * 3. Easy to test single units.
         */
        TransportStrategy transport = new Car();
        transport.selectTransport();

        TransportContext transportContext = new TransportContext(transport);
        transportContext.selectTransport();

        Car car = new Car();
        car.selectTransport();
    }
}

// STRATEGY
interface TransportStrategy {
    void selectTransport();
}

// CONCRETE STRATEGIES
class Car implements TransportStrategy {
    @Override
    public void selectTransport() {
        System.out.println("User opted to go by car");
    }
}

class Bus implements TransportStrategy {

    @Override
    public void selectTransport() {
        System.out.println("User opted to go by bus");
    }
}

class Taxi implements TransportStrategy {
    @Override
    public void selectTransport() {
        System.out.println("User opted to go by taxi");
    }
}

// CONTEXT
class TransportContext {

    private TransportStrategy strategy;

    TransportContext() {
    }

    TransportContext(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    void selectTransport() {
        this.strategy.selectTransport();
    }
}
