package step3;

import step3.strategy.RandomStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingCarList {

    private List<Car> racingCarList;

    public RacingCarList(int carCount) {
        List<Car> list = new ArrayList<>();
        IntStream
                .range(0, carCount)
                .forEach(i -> {
                    list.add(new Car(new RandomStrategy()));
                });
        racingCarList = Collections.unmodifiableList(list);
    }

    public RacingRecord moveCars() {
        racingCarList
                .forEach(Car::move);
        return new RacingRecord(
                racingCarList
                        .stream()
                        .map(Car::getLocation)
                        .collect(Collectors.toList()));

    }

    public List<Integer> getRacingStatus() {
        return racingCarList
                .stream()
                .map(Car::getLocation)
                .collect(Collectors.toList());
    }
}
