package racingcar.domain;

import java.util.Objects;

public class DrivingDistance {

    private static final int ZERO = 0;

    private int drivingDistance;

    public DrivingDistance(int drivingDistance) {
        validate(drivingDistance);
        this.drivingDistance = drivingDistance;
    }

    private void validate(int drivingDistance) {
        if (drivingDistance < ZERO) {
            throw new IllegalArgumentException();
        }
    }

    public void increase() {
        drivingDistance++;
    }

    public int getDrivingDistance() {
        return drivingDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrivingDistance)) {
            return false;
        }
        DrivingDistance d = (DrivingDistance) o;
        return Objects.equals(this.drivingDistance, d.drivingDistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drivingDistance);
    }
}
