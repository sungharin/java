package Car.rasing;

public interface Tire {
    int capacity;  
    int consume;  

    Tire(int capacity, int consume) {
        this.capacity = capacity;
        this.consume = consume;
    }

    void UseTire() {
        capacity -= consume;
    }

    boolean IsAvailable() {
        return capacity - consume > 0;
        
        //abstract boolean IsAbailable();
    }
}

