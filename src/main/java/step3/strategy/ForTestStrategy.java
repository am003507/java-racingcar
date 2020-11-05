package step3.strategy;

import java.util.function.BooleanSupplier;

public class ForTestStrategy implements MoveStrategy {

    private BooleanSupplier booleanSupplier;

    public ForTestStrategy(BooleanSupplier booleanSupplier) {
        this.booleanSupplier = booleanSupplier;
    }

    @Override
    public boolean move() {
        return booleanSupplier.getAsBoolean();
    }
}
