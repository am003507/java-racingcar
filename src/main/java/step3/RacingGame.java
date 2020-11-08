package step3;

import java.util.stream.IntStream;

public class RacingGame {

    private MoveStrategy moveStrategy;
    private RacingCarList racingCarList;

    public RacingGame(RacingSpec racingSpec) {
        this.racingCarList = new RacingCarList(racingSpec.getUsers());
        this.racingSpec = racingSpec;
    }

    public RacingRecord play() {
        RacingRecord racingRecord = new RacingRecord();
        IntStream
                .range(0, racingSpec.getLab())
                .forEach(i -> {
                    racingRecord.addLabRecord(
                            racingCarList.moveCars()
                    );
                });
        return racingRecord;
    }

    public RacingCarList getRacingCarList() {
        return racingCarList;
    }

}
