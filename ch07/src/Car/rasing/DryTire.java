package Car.rasing;

public class DryTire extends Tire {

    DryTire(int capacity, int consume) {
        super(capacity, consume);
    }

    @Override
    boolean IsAvailable() {
        return capacity - consume > 0;
    }
}
