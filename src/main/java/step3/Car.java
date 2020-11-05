package step3;

import step3.strategy.MoveStrategy;

public class Car {

    private int location;
    private MoveStrategy moveStrategy;

    public Car(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move() {
        if (moveStrategy.move()) {
            goForward();
        }
    }

    private void goForward() {
        location++;
    }

    public int getLocation() {
        return location;
    }

}
