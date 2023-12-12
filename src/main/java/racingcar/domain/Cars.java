package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(List<String> carNames) {
        validate(carNames);
        this.cars = carNames.stream()
            .map(Car::new)
            .collect(Collectors.toList());
    }

    private void validate(List<String> carNames) {
        if (carNames.size() != carNames.stream().distinct().count()) {
            throw new IllegalArgumentException();
        }
    }

    public void attemptToMove() {
        for (Car car : cars) {
            car.attemptToMove();
        }
    }
}
