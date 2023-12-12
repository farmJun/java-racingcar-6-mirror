package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

    @DisplayName("자동차가 이동함을 테스트하다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void testMovable(int number) {
        Car car = new Car("car");
        car.attemptToMove(number);
        assertEquals(1, car.getDrivingDistance());
    }

    @DisplayName("자동차가 이동하지 않음을 테스트하다.")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void testNotMovable(int number) {
        Car car = new Car("car");
        car.attemptToMove(number);
        assertEquals(0, car.getDrivingDistance());
    }
}