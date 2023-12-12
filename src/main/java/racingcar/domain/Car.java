package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final Name carName;
    private final DrivingDistance drivingDistance;

    public Car(Name carName, DrivingDistance drivingDistance) {
        this.carName = carName;
        this.drivingDistance = drivingDistance;
    }

    public void attemptToMove() {
        if (movable()) {
            drivingDistance.increase();
        }
    }

    private boolean movable() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}
