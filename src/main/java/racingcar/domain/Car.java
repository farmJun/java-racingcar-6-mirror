package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int initialDrivingDistance = 0;

    private final Name carName;
    private final DrivingDistance drivingDistance;

    public Car(String carName) {
        this.carName = new Name(carName);
        this.drivingDistance = new DrivingDistance(initialDrivingDistance);
    }

    public void attemptToMove() {
        if (movable()) {
            drivingDistance.increase();
        }
    }

    private boolean movable() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }

    public String getName() {
        return carName.getName();
    }

    public String getDrivingDistance() {
        return drivingDistance.getDrivingDistance();
    }
}
