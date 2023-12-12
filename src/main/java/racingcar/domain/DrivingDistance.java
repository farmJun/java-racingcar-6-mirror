package racingcar.domain;

public class DrivingDistance {

    private static final String DISTANCE = "-";
    private int drivingDistance;

    public DrivingDistance(int drivingDistance) {
        this.drivingDistance = drivingDistance;
    }

    public void increase() {
        drivingDistance++;
    }

    public String getDrivingDistance() {
        return DISTANCE.repeat(drivingDistance);
    }
}
