package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeNumberTest {

    @Test
    void ChangeNumber_생성_테스트() {
        assertDoesNotThrow(() -> new ChangeNumber("2,3"));
        assertDoesNotThrow(() -> new ChangeNumber("2, 3"));
    }

    @Test
    void ChangeNumber_생성_오류_테스트() {
        assertThrows(IllegalArgumentException.class, () -> new ChangeNumber(" 2,3"));
    }
}