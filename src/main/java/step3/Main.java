package step3;

import step3.controller.InputController;
import step3.controller.ResultController;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        RacingSpec spec = InputController.enterInput();
        List<RacingRecord> racingRecords = new RacingGame(spec).play();
        ResultController.drawRacingRecord(racingRecords);
    }
}
