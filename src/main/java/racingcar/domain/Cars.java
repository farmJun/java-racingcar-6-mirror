package racingcar.domain;

import java.util.Collections;
import java.util.LinkedHashMap;
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
            car.attemptToMove(Engine.on());
        }
    }

    public LinkedHashMap<Name, Integer> getCarNameAndDrivingDistance() {
        LinkedHashMap<Name, Integer> carNameAndDrivingDistance = new LinkedHashMap<>();
        for (Car car : cars) {
            carNameAndDrivingDistance.put(car.getName(), car.getDrivingDistance());
        }
        return carNameAndDrivingDistance;
    }

    public DrivingDistance findLongestDrivingDistance() {
        return new DrivingDistance(Collections.max(cars).getDrivingDistance());
    }

    public List<Car> findMostDrivenCars(DrivingDistance drivingDistance) {
        return cars.stream()
            .filter(car -> car.isMostDrivenCar(drivingDistance))
            .collect(Collectors.toList());
    }
}
