package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car implements Comparable<Car> {

    private static final int INITIAL_DRIVING_DISTANCE = 0;
    private static final int ZERO = 0;
    private static final int NINE = 9;
    private static final int MOVE_CRITERION = 4;

    private final Name carName;
    private final DrivingDistance drivingDistance;

    public Car(String carName) {
        this.carName = new Name(carName);
        this.drivingDistance = new DrivingDistance(INITIAL_DRIVING_DISTANCE);
    }

    public void attemptToMove(int number) {
        if (movable(number)) {
            drivingDistance.increase();
        }
    }

    private boolean movable(int number) {
        return number >= MOVE_CRITERION;
    }

    public boolean isMostDrivenCar(DrivingDistance longestDrivingDistance) {
        return drivingDistance.equals(longestDrivingDistance);
    }

    public Name getName() {
        return carName;
    }

    public int getDrivingDistance() {
        return drivingDistance.getDrivingDistance();
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.drivingDistance.getDrivingDistance(),
            other.drivingDistance.getDrivingDistance());
    }
}
