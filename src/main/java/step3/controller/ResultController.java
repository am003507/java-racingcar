package step3.controller;

import step3.RacingRecord;

import java.util.List;
import java.util.stream.IntStream;

public class ResultController {

    private static final String RACING_DASH = "-";
    private static final String NEW_LINE = "\n";

    public static void drawRacingRecord(List<RacingRecord> racingRecords) {
        for (RacingRecord racingRecord : racingRecords) {
            System.out.println(makeRacingResult(racingRecord));
        }
    }

    private static String makeRacingResult(RacingRecord racingRecord) {
        StringBuilder sb = new StringBuilder();
        racingRecord
                .export()
                .forEach(
                        location -> {
                            sb.append(makeLocationString(location));
                            sb.append(NEW_LINE);
                        }
                );
        return sb.toString();
    }

    private static String makeLocationString(int location) {
        StringBuilder sb = new StringBuilder();
        IntStream
                .range(0, location)
                .forEach(i -> sb.append(RACING_DASH));
        return sb.toString();
    }

}
