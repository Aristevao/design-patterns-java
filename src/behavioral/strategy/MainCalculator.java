package strategy;

class MainCalculator {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyAdd()); // "Add" example by constructor.

        String action = "addition";
        if (action == "addition")
            context.setStrategy(new ConcreteStrategyAdd());

        if (action == "subtraction")
            context.setStrategy(new ConcreteStrategySubtract());

        if (action == "multiplication")
            context.setStrategy(new ConcreteStrategyMultiply());

        float result = context.executeStrategy(10, 15);
        System.out.println(result);
    }
};

interface Strategy {
    float execute(float a, float b);
}

// Concrete strategies implement the algorithm while following
// the base strategy interface. The interface makes them
// interchangeable in the context.
class ConcreteStrategyAdd implements Strategy {

    @Override
    public float execute(float a, float b) {
        return a + b;
    }
}

class ConcreteStrategySubtract implements Strategy {
    @Override
    public float execute(float a, float b) {
        return a - b;
    }
}

class ConcreteStrategyMultiply implements Strategy {
    @Override
    public float execute(float a, float b) {
        return a * b;
    }
}

// The context defines the interface of interest to clients.
class Context {
    // The context maintains a reference to one of the strategy
    // objects. The context doesn't know the concrete class of a
    // strategy. It should work with all strategies via the
    // strategy interface.
    private Strategy strategy;

    // Usually the context accepts a strategy through the
    // constructor
    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    Context() {
    }

    // And also provides a setter so that the
    // strategy can be switched at runtime.
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // The context delegates some work to the strategy object
    // instead of implementing multiple versions of the
    // algorithm on its own.
    public float executeStrategy(float a, float b) {
        return this.strategy.execute(a, b);
    }
}
