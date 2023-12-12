package racingcar.domain;

public class DrivingDistance {

    private static final int initialDrivingDistance = 0;
    private int drivingDistance;

    public DrivingDistance() {
        this.drivingDistance = initialDrivingDistance;
    }

    public DrivingDistance(int drivingDistance) {
        this.drivingDistance = drivingDistance;
    }

    public void increase() {
        drivingDistance++;
    }
}
