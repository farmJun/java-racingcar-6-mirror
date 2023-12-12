package racingcar.domain;

import java.util.Objects;

public class DrivingDistance {

    private int drivingDistance;

    public DrivingDistance(int drivingDistance) {
        this.drivingDistance = drivingDistance;
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
