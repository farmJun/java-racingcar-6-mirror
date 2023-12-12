package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Referee {

    private Referee() {

    }

    public static Winners judge(Cars cars) {
        DrivingDistance longestDrivingDistance = cars.findLongestDrivingDistance();
        List<Car> mostDrivenCars = cars.findMostDrivenCars(longestDrivingDistance);

        return new Winners(mostDrivenCars.stream()
            .map(Car::getName)
            .map(Winner::new)
            .collect(Collectors.toList()));
    }
}
