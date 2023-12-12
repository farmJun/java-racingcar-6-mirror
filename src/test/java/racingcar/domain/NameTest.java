package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NameTest {

    @DisplayName("유효한 길이의 이름을 생성한다.")
    @ParameterizedTest
    @ValueSource(strings = {"a", "ab", "abc", "abcd"})
    void createNameByValidNameLength(String input) {
        assertDoesNotThrow(() -> new Name(input));
    }

    @DisplayName("유효하지 않은 길이로 이름을 생성하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"", "abcdef"})
    void createNameByInvalidNameLength(String input) {
        assertThrows(IllegalArgumentException.class, () -> new Name(input));
    }
}