package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RacingGame {

    private RacingCarList racingCarList;
    private RacingSpec racingSpec;

    public RacingGame(RacingSpec racingSpec) {
        this.racingCarList = new RacingCarList(racingSpec.getCarCount());
        this.racingSpec = racingSpec;
    }

    public List<RacingRecord> play() {
        List<RacingRecord> ret = new ArrayList<>();
        IntStream.range(0, racingSpec.getMoveCount()).forEach(i -> {
            RacingRecord racingRecord = racingCarList.moveCars();
            ret.add(racingRecord);
        });
        return ret;
    }

}
