package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberOfAttemptsTest {

    @DisplayName("유효한 숫자로 시도할 회수를 생성한다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void createNumberOfAttemptsByValidNumber(int input) {
        assertDoesNotThrow(() -> new NumberOfAttempts(input));
    }

    @DisplayName("유효하지 않은 숫자로 시도할 회수를 생성하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3})
    void createNumberOfAttemptsByInvalidNumber(int input) {
        assertThrows(IllegalArgumentException.class, () -> new NumberOfAttempts(input));
    }
}