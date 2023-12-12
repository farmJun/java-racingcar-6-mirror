package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DrivingDistanceTest {

    @DisplayName("유효한 숫자로 이동 거리를 생성한다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void createDrivingDistanceByValidNumber(int input) {
        assertDoesNotThrow(() -> new DrivingDistance(input));
    }

    @DisplayName("유효하지 않은 숫자로 이동 거리를 생성하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3})
    void createDrivingDistanceByInvalidNumber(int input) {
        assertThrows(IllegalArgumentException.class, () -> new DrivingDistance(input));
    }
}