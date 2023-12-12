package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.NumberOfAttempts;
import racingcar.domain.Referee;
import racingcar.domain.Winners;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarGame {

    public void run() {
        Cars cars = readCars();
        NumberOfAttempts numberOfAttempts = readNumberOfAttempts();

        attemptUntilFinish(cars, numberOfAttempts);

        Winners winners = Referee.judge(cars);
        printWinners(winners);
    }

    private static void printWinners(Winners winners) {
        OutputView.printWinners(winners.getNames());
    }

    private NumberOfAttempts readNumberOfAttempts() {
        return new NumberOfAttempts(InputView.readNumberOfAttempts());
    }

    private Cars readCars() {
        return new Cars(InputView.readCarNames());
    }

    private void attemptUntilFinish(Cars cars, NumberOfAttempts numberOfAttempts) {
        OutputView.printResult();

        while (numberOfAttempts.hasNext()) {
            cars.attemptToMove();
            OutputView.printCarNamesAndMovingDistances(cars.getCarNameAndDrivingDistance());
            numberOfAttempts.finish();
        }
    }
}
